import java.util.Arrays;

public class Panini extends Sandwich {

    private static final float PRICE = 3.50f;
    private static final int CALORIES = 120;
    private static final boolean VEGETARIAN = true;
    private static final java.util.List<String> INGREDIENTS = Arrays.asList("tomato", "salad", "cheese", "avocado", "cucumber");

    public Panini() {
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
