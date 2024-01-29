public class Student extends Person{
    private int id;
    private double gpa;
    private double money = 36600.00;
    private static int countId = 0;

    public Student() {
        this.id = countId++;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67) {
            return money;
        }
        else{
            return 0.0;
        }
    }
}

