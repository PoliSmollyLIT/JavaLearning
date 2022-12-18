package bg.tu_varna.sit.task4;

public class Candidancy implements Comparable<Candidancy> {
    private int candidacyId;
    private Person candidatePresident;
    private Person candidateVicePresident;
    private Party party;
    public Candidancy(int candidacyId, Person candidatePresident, Person candidateVicePresident, Party party) {
        this.candidacyId = candidacyId;
        this.candidatePresident = candidatePresident;
        this.candidateVicePresident = candidateVicePresident;
        this.party = party;
    }
    public int getCandidacyId() {
        return candidacyId;
    }
    public Person getCandidatePresident() {
        return candidatePresident;
    }
    public Person getCandidateVicePresident() {
        return candidateVicePresident;
    }
    public Party getParty() {
        return party;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + candidacyId;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Candidancy other = (Candidancy) obj;
        if (candidacyId != other.candidacyId)
            return false;
        return true;
    }
    
    @Override
    public int compareTo(Candidancy o) {
        return (this.getCandidacyId()<o.getCandidacyId())? -1: (this.getCandidacyId()==o.getCandidacyId())? 0: 1;
    }
    @Override
    public String toString() {
        return "Candidancy [candidacyId=" + candidacyId + ", candidatePresident=" + candidatePresident
                + ", candidateVicePresident=" + candidateVicePresident + ", party=" + party + "]";
    }
        
    
}