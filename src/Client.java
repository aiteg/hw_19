public class Client extends Person {

    public Client(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Client -  " + super.toString();
    }
}
