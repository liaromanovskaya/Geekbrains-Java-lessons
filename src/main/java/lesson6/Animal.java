package lesson6;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public String getName() {
        return name;
    }
}
