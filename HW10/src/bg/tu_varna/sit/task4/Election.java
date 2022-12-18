package bg.tu_varna.sit.task4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Election {
    private String dateOfElection;
    private Map< Candidancy, Integer> results = new HashMap<>();
    public Election(String dateOfElection, Map<Candidancy, Integer> results) {
        this.dateOfElection = dateOfElection;
        this.results = results;
    }
    public String getDateOfElection() {
        return dateOfElection;
    }
    public Map<Candidancy, Integer> getResults() {
        return results;
    } 
    public void addResult(Candidancy candidancy, Integer votes)   {
        results.put(candidancy, votes);
    }
    public void printOrderedByCandidacyId(){
        StringBuffer output = new StringBuffer();
        Map<Candidancy, Integer> sortedIds = new TreeMap<Candidancy, Integer>(
            new Comparator<Candidancy>(){
                @Override
                public int compare(Candidancy o1, Candidancy o2) {
                    return o2.compareTo(o1);
                }
            }
        );
        sortedIds.forEach((candidate, votes)->{
            output.append(candidate + " " + votes + "\n");
        });
        System.out.println(output.toString());
    }
    public void printOrderedByVotes(){
        StringBuffer output = new StringBuffer();
        List<Map.Entry<Candidancy, Integer>> sorted = new LinkedList<Map.Entry<Candidancy, Integer>>(results.entrySet());
        Collections.sort(sorted, new Comparator<Map.Entry<Candidancy, Integer>>(){
            @Override
            public int compare(Map.Entry<Candidancy, Integer> o1, Map.Entry<Candidancy, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<Candidancy, Integer> sortedVotes = new HashMap<>();
        for (Map.Entry<Candidancy, Integer> entry : sorted) {
            sortedVotes.put(entry.getKey(), entry.getValue());
        }
        sortedVotes.forEach((candidate, votes)->{
            output.append(candidate + " " + votes + "\n");
        });
        System.out.println(output.toString());
    }
    public int getVotesByPerson(Person person){
        for (Map.Entry<Candidancy, Integer> result : results) {
            if(result.getKey().getCandidatePresident() == person || result.getKey().getCandidateVicePresident() == person){
                return Integer.parseInt(result.getValue());
            }
        }
        return 0;
    }
    public void getUnsupportedCandidacies(){
        StringBuffer output = new StringBuffer();
        results.forEach((Candidancy candidate, Integer votes)->{
            if(votes==0){
                output.append(candidate.toString() + "\n");
            }
        });
        System.out.println(output.toString());
    }
    public void calculateElectionResults(){
        int maxVotes = 0;
        int allVotes = 0;
        StringBuffer output = new StringBuffer();
        results.forEach((Candidancy candidate, Integer votes)->{
            allVotes += (int)votes;
            if((int)votes > maxVotes){
                maxVotes = (int)votes;
                output.delete(0, output.length());
                output.append(candidate);
            }
        });
        if(maxVotes<(allVotes/2)){
            output.delete(0, output.length());
            output.append("Vtori tur");
        }
        System.out.println(output.toString());
    }
}
