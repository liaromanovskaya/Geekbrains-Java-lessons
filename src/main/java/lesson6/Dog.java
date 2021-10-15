package lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        System.out.println("Привет! Я собака " + name);
    }

    @Override
    public void run(int distance) {
        if (distance > 500)
            throw new IllegalArgumentException("Слишком далеко бежать, сам беги");

        System.out.println(getName() + " пробежал " + distance + " метров");
    }

    @Override
    public void swim(int distance) {
        if (distance > 10)
            throw new IllegalArgumentException("Слишком далеко плыть, не поплыву");

        System.out.println(getName() + "проплыл " + distance + " метров");
    }
}
