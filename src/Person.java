public class Person implements InterfacePayable, Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private static int countId = 0;

    public Person() {
        this.id = countId++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
