package items;

public class Estus extends Healing {
    @Override
    public void action() {
        System.out.println("Cura 25% de HP");
        removeQuantity(1);
    }

    @Override
    public String toString() {
        return "Estus{" +
                "quantity=" + quantity +
                '}';
    }
}
