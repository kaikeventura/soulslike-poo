package items;

public interface ItemActions {
    boolean isInfinite();
    boolean isUsable();
    boolean isDrop();
    void action();
}
