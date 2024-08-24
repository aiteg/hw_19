public class Staff extends Person {

    public Staff(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Staff -  " + super.toString();
    }
}
