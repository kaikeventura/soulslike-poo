package items;

public abstract class Item implements ItemActions {
    public int quantity = 0;

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public void removeQuantity(int amount) {
        this.quantity -= amount;
    }
}
