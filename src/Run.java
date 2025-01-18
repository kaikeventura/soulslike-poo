import items.Estus;
import items.Molotov;
import items.Potion;

public class Run {
    public static void main(String[] args) {
        var character = new Character(
                "Donnie", BodyType.MALE, Clazz.WARRIOR
        );
        System.out.println(character);

        var estus = new Estus();
        var potion = new Potion();
        var molotov = new Molotov();

        estus.addQuantity(5);
        potion.addQuantity(10);
        molotov.addQuantity(15);

        character.addItem(estus);
        character.addItem(potion);
        character.addItem(molotov);

        System.out.println(character);
    }
}
