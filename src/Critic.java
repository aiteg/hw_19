public class Critic extends Person {

    public Critic(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Critic -  " + super.toString();
    }
}
