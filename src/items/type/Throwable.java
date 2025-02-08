package items.type;

import items.base.Item;

public class Throwable extends Item {

    @Override
    public boolean isInfinite() {
        return false;
    }

    @Override
    public boolean isUsable() {
        return false;
    }

    @Override
    public boolean isDrop() {
        return true;
    }

    @Override
    public void action() {
        System.out.println("Arremeça o item");
    }
}
