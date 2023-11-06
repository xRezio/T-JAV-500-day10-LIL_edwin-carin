import java.util.Arrays;

public class HamSandwich extends Sandwich {

    private static final float PRICE = 4.00f;
    private static final int CALORIES = 230;
    private static final boolean VEGETARIAN = false;
    private static final java.util.List<String> INGREDIENTS = Arrays.asList("tomato", "salad", "cheese", "ham");

    public HamSandwich() {
        super(VEGETARIAN, INGREDIENTS);
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
