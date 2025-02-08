package items.base;

public interface ItemActions {
    boolean isInfinite();
    boolean isUsable();
    boolean isDrop();
    void action();
}
