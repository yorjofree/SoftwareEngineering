package OOP;

public class English extends Person{
    public English(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        speak();
    }

    private void speak() {
        System.out.println("Hello World!");
    }
}
