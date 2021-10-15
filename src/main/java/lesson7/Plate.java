package lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске:" + foodCount);
    }

    public int decreaseFood(int food) {
        if (food > foodCount) {
            foodCount = 0;
            return food - foodCount;
        }

        foodCount -= food;
        return food;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood(int food) {
        foodCount += food;
    }
}
