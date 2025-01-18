package items;

public class Potion extends Healing {
    @Override
    public void action() {
        System.out.println("Cura envenenamento");
    }

    @Override
    public String toString() {
        return "Potion{" +
                "quantity=" + quantity +
                '}';
    }
}
