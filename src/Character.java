import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private BodyType bodyType;
    private Clazz clazz;
    private AttributePoints attributePoints;
    private ArrayList<Item> allItems;

    public Character(
            String name,
            BodyType bodyType,
            Clazz clazz
    ) {
        this.name = name;
        this.bodyType = bodyType;
        this.clazz = clazz;
        this.attributePoints = clazz.defaultAttributePoints();
        this.allItems = clazz.defaultItems();
    }

    public String getName() {
        return name;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void addItem(Item item) {
        this.allItems.add(item);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", bodyType=" + bodyType +
                ", clazz=" + clazz +
                ", attributePoints=" + attributePoints +
                ", allItems=" + allItems +
                '}';
    }
}
