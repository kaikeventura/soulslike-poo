import items.base.Item;

import java.util.ArrayList;

public enum Clazz {
    WARRIOR {
        @Override
        public AttributePoints defaultAttributePoints() {
            return new AttributePoints(6, 4, 7, 3);
        }

        @Override
        public ArrayList<Item> defaultItems() {
            return new ArrayList<>();
        }

    }, KNIGHT {
        @Override
        public AttributePoints defaultAttributePoints() {
            return new AttributePoints(5, 5, 6, 4);
        }

        @Override
        public ArrayList<Item> defaultItems() {
            return new ArrayList<>();
        }
    }, SORCERER {
        @Override
        public AttributePoints defaultAttributePoints() {
            return new AttributePoints(4, 5, 3, 8);
        }

        @Override
        public ArrayList<Item> defaultItems() {
            return new ArrayList<>();
        }
    };

    public abstract AttributePoints defaultAttributePoints();
    public abstract ArrayList<Item> defaultItems();
}
