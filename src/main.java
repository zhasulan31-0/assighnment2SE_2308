import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Student("Nikita", "Bobylev", 3.0));
        personList.add(new Student("Sanat", "Mamyrbek", 2.90));
        personList.add(new Employee("Askar", "Khaimuldin", "Teacher", 2000000));
        personList.add(new Employee("Merey", "Ibraim", "Developer", 500.00));
        Collections.sort(personList);
        printData(personList);
    }

    public static void printData(ArrayList<Person> people) {
        for(Person person : people) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount());
        }
    }

}
