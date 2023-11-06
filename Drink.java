public abstract class Drink implements Food {
    private final boolean aCan;

    public Drink(boolean aCan) {
        this.aCan = aCan;
    }

    public boolean isACan() {
        return aCan;
    }
}
