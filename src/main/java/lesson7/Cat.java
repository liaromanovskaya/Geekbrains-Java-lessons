package lesson7;

import java.util.Random;

public class Cat {
    private Random random = new Random();
    private String name;
    private int maxAppetite;
    private int satiety;

    public Cat(String name, int maxAppetite, int satiety) {
        this.name = name;
        this.maxAppetite = maxAppetite;
        this.satiety = satiety;
    }

    public Cat(String name, int maxAppetite) {
        this(name, maxAppetite, 0);
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return maxAppetite - satiety > 0;
    }

    public void eat(Plate plate) {
        satiety += plate.decreaseFood(random.nextInt(4) + 3);
    }
}
