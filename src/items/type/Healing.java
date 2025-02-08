package items.type;

import items.base.Item;

public class Healing extends Item {

    @Override
    public boolean isInfinite() {
        return false;
    }

    @Override
    public boolean isUsable() {
        return true;
    }

    @Override
    public boolean isDrop() {
        return false;
    }

    @Override
    public void action() {
        System.out.println("Cura");
    }
}
