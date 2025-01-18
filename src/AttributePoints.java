
public class AttributePoints {
    private int level = 20;
    private int vitality;
    private int endurance;
    private int strength;
    private int intelligence;

    public AttributePoints(int vitality, int endurance, int strength, int intelligence) {
        this.vitality = vitality;
        this.endurance = endurance;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public int getVitality() {
        return vitality;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        return "AttributePoints{" +
                "level=" + level +
                ", vitality=" + vitality +
                ", endurance=" + endurance +
                ", strength=" + strength +
                ", intelligence=" + intelligence +
                '}';
    }
}
