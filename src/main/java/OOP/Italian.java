package OOP;

public class Italian extends Person{
    @Override
    public void say() {
        parla();
    }

    public Italian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void parla() {
        System.out.println("Ciao gente!");
    }
}
