
public class Person implements Comparable<Person>{

    private String name;

    private int age;

    private String occupation;

    public Person(String name, int age, String occupation) {
        this.setName(name);
        this.setAge(age);
        this.setOccupation(occupation);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    private void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return String.format("%s - age: %d, occupation: %s", this.getName(), this.getAge(), this.getOccupation());
    }

    @Override
    public int compareTo(Person nextPerson) {
        return this.getAge() - nextPerson.getAge();
    }
}
