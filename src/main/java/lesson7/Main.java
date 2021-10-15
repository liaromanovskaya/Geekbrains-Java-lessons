package lesson7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {
                new Cat("Мяуковелли", 10),
                new Cat("Бегемот", 20, 4)

        };
        Plate plate = new Plate(20);
        plate.printInfo();
        while (plate.getFoodCount() > 0) {
            for (Cat cat : cats) {
                cat.eat(plate);
                plate.printInfo();
                Thread.sleep(1000);
            }
        }

        for (Cat cat : cats) {
            String status;
            if (cat.isHungry()) {
                status = "голоден";
            } else {
                status = "сыт";
            }
            System.out.println("Кот " + cat.getName() + " " + status);
        }
    }
}
