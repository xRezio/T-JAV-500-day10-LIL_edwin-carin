public abstract class Bread implements Food {
    private final float price;
    private final int calories;
    private final int bakingTime;

    public Bread(float price, int calories, int bakingTime) {
        this.price = price;
        this.calories = calories;
        this.bakingTime = bakingTime;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public int getBakingTime() {
        return bakingTime;
    }
}
