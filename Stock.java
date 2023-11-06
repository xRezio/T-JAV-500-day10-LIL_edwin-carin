import java.util.HashMap;
import java.util.Map;

public class Stock {
    private Map<Class<? extends Food>, Integer> inventory;

    public Stock() {
        inventory = new HashMap<>();
        // Initialize with 100 items for each known food type
        inventory.put(FrenchBaguette.class, 100);
        inventory.put(SoftBread.class, 100);
        inventory.put(AppleSmoothie.class, 100);
        inventory.put(Coke.class, 100);
        inventory.put(HamSandwich.class, 100);
        inventory.put(Panini.class, 100);
        inventory.put(Cookie.class, 100);
        inventory.put(CheeseCake.class, 100);
        // ... add other food items as necessary
    }

    public int getNumberOf(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!inventory.containsKey(foodClass)) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getSimpleName());
        }
        return inventory.get(foodClass);
    }

    public boolean add(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!inventory.containsKey(foodClass)) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getSimpleName());
        }
        inventory.put(foodClass, inventory.get(foodClass) + 1);
        return true;
    }

    public boolean remove(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!inventory.containsKey(foodClass)) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getSimpleName());
        }
        int currentCount = inventory.get(foodClass);
        if (currentCount == 0) {
            return false; // Can't remove if stock is 0
        }
        inventory.put(foodClass, currentCount - 1);
        return true;
    }
}
