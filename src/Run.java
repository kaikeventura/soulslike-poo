import items.Estus;
import items.base.Item;
import items.Potion;

public class Run {
    public static void main(String[] args) {
        var character = new Character(
                "Donnie", BodyType.MALE, Clazz.WARRIOR
        );

        var character2 = new Character();
        character2.setName("Donnie");
        character2.setBodyType(BodyType.MALE);

        System.out.println(character);
        System.out.println(character2);

        Item estus = new Estus();
        Item potion = new Potion();

        potion.addQuantity(10);

        System.out.println(estus);

        estus = potion;

        System.out.println(estus);


//
//        estus.addQuantity(5);
//        potion.addQuantity(10);
//        molotov.addQuantity(15);
//
//        character.addItem(estus);
//        character.addItem(potion);
//        character.addItem(molotov);

//        for (int index = 0; index <= 5; index++) {
//            System.out.println("oi");
//        }
//
//        var xpto = 0;
//
//        while (xpto <= 5) {
//            System.out.println("while");
//
//            xpto++;
//        }
//
//        var xpto2 = 0;
//
//        do {
//            System.out.println("do while");
//            xpto2++;
//        } while (xpto2 <= 5);
//
//        for (Item item : character.getAllItems()) {
//            System.out.println(item);
//        }

//        character.getAllItems().forEach(System.out::println);
//
//        character.getAllItems().forEach(item -> {
//            System.out.println(item);
//        });

        character.getAllItems().forEach(item -> {
//            if (item.quantity == 15) {
//                try {
//                    throw new RuntimeException("erro");
//                } catch (RuntimeException exception) {
//                    System.out.println(exception.getStackTrace());
//                }
//            } else if (item.quantity == 10) {
//                System.out.println("Patches é um amigo de vdd");
//            }
//            System.out.println(item);
            switch (item.quantity) {
                case 15: {
                    try {
                        throw new RuntimeException("erro");
                    } catch (RuntimeException exception) {
                        System.out.println(exception.getMessage());
                    }
                }
                case 10: {
                    System.out.println("Patches é um amigo de vdd");
                }
            }
            System.out.println(item);
        });
    }
}
