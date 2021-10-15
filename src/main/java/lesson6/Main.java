package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");

        cat.run(200);
        dog.run(300);
        cat.swim(50);
    }
}
