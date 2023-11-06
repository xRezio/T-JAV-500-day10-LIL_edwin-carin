import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private final List<Food> items;
    private final Stock stock;

    public CustomerOrder(Stock stock) {
        this.items = new ArrayList<>();
        this.stock = stock;
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        if (stock.remove(food.getClass())) {
            items.add(food);
            return true;
        }
        return false;
    }

    public boolean removeItem(Food food) {
        if (items.contains(food)) {
            items.remove(food);
            stock.add(food.getClass());
            return true;
        }
        return false;
    }

    public float getPrice() {
        float total = 0;
        for (Food item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public boolean addMenu(Menu<?, ?> menu) {
        // Check if there's enough stock to add the menu items.
        boolean canAddDrink = stock.getNumberOf(menu.getDrink().getClass()) > 0;
        boolean canAddMeal = stock.getNumberOf(menu.getMeal().getClass()) > 0;

        if (!canAddDrink || !canAddMeal) {
            return false; // Not enough items in the stock for the menu.
        }

        // Add items to the order and remove them from the stock.
        try {
            if (addItem(menu.getDrink()) && addItem(menu.getMeal())) {
                return true;
            } else {
                // If for some reason we can't add both items to the order, we should rollback.
                if (canAddDrink) removeItem(menu.getDrink());
                if (canAddMeal) removeItem(menu.getMeal());
                return false;
            }
        } catch (NoSuchFoodException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean removeMenu(Menu<?, ?> menu) {
        // Check if the menu items are in the order
        if (items.contains(menu.getDrink()) && items.contains(menu.getMeal())) {
            removeItem(menu.getDrink());
            removeItem(menu.getMeal());
            return true;
        }
        return false;
    }

    public void printOrder() {
        System.out.println("Your order is composed of:");
        float total = 0;
        for (Food item : items) {
            System.out.println("- " + item.getClass().getSimpleName() + " (" + item.getPrice() + " euros)");
            total += item.getPrice();
        }
        System.out.println("For a total of " + total + " euros.");
    }
}
