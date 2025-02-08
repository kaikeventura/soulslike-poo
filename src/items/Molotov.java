package items;

import items.type.Throwable;

public class Molotov extends Throwable {
    @Override
    public void action() {
        System.out.println("Arremça molotov com 50% de dano");
    }

    @Override
    public String toString() {
        return "Molotov{" +
                "quantity=" + quantity +
                '}';
    }
}
