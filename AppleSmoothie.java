public class AppleSmoothie extends Drink {

    private static final float PRICE = 1.50f;
    private static final int CALORIES = 431;
    private static final boolean CAN = false;

    public AppleSmoothie() {
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
