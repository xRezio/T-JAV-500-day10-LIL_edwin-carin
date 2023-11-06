public class Cookie extends Dessert {

    private static final float PRICE = 0.90f;
    private static final int CALORIES = 502;

    @Override
    public float getPrice() {
        return PRICE;
    }

    @Override
    public int getCalories() {
        return CALORIES;
    }
}
