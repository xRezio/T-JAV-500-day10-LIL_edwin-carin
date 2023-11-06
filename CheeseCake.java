public class CheeseCake extends Dessert {

    private static final float PRICE = 2.10f;
    private static final int CALORIES = 321;

    @Override
    public float getPrice() {
        return PRICE;
    }

    @Override
    public int getCalories() {
        return CALORIES;
    }
}
