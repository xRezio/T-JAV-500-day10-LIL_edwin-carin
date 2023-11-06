import java.util.List;

public abstract class Sandwich implements Food {
    private final boolean vegetarian;
    private final List<String> ingredients;

    public Sandwich(boolean vegetarian, List<String> ingredients) {
        this.vegetarian = vegetarian;
        this.ingredients = ingredients;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
