package bg.tu_varna.sit.task5;

import java.util.regex.Pattern;

public class Person {
    private String namePattern = Pattern.quote("[A-Z][a-z]* [A-Z][a-z]*");
    private String name;

    public Person(String name) {
       try{
        setName(name);
       }catch(PersonException ex){
        ex.printStackTrace();
       }
    }

    public void setName(String name) throws PersonException{
        if(!name.matches(namePattern))
        throw new PersonException();
        
        this.name = name;
    }

    public String getNamePattern() {
        return namePattern;
    }

    public String getName() {
        return name;
    }
    
}
