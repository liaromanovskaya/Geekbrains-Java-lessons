package lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("Привет! Я кот " + name);
    }

    @Override
    public void run(int distance) {
        if (distance > 200)
            throw new IllegalArgumentException("Слишком далеко бежать, сам беги");

        System.out.println(getName() + " пробежал " + distance + " метров");
    }

    @Override
    public void swim(int distance) {
        throw new IllegalArgumentException("не могу плыть, извините");
    }
}
