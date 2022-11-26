package bg.tu_varna.sit.task1;

public class Child {
    private String name;
    private int age;
    private double weigth;

    public Child(String name, int age, double weigth) {
        setName(name);
        try {
            setAge(age);
        } catch (InvalidAgeException ex) {
            System.out.printf(ex.getMessage());
        }
        setWeigth(weigth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 3)
            throw new InvalidAgeException();
        this.age = age;

    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Име: " + name + "\nВъзраст: " + age;
    }

    
}