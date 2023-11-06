public abstract class Menu<T extends Drink, U extends Food> {
    private T drink;
    private U meal;

    public Menu(T drink, U meal) {
        this.drink = drink;
        this.meal = meal;
    }

    public T getDrink() {
        return drink;
    }

    public U getMeal() {
        return meal;
    }

    public float getPrice() {
        float sum = drink.getPrice() + meal.getPrice();
        return sum - sum * 0.10f;
    }
}
