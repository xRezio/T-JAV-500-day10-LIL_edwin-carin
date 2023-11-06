public class Coke extends Drink {

    private static final float PRICE = 1.20f;
    private static final int CALORIES = 105;
    private static final boolean CAN = true;

    public Coke() {
        super(CAN);
    }

    @Override
    public float getPrice() {
        return PRICE;
    }

    @Override
    public int getCalories() {
        return CALORIES;
    }
}
