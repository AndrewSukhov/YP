package JavaCore1.module1.sptint1.theme03.task0304;

public class Praktikum {
    public static void main(String[] args) {
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources characterResources = new Resources(
                inputGold,
                inputSilver,
                inputWood,
                inputHealth,
                inputHasHelper
        );

        int characterGold = (int) characterResources.gold;
        int characterSilver = (int) (characterResources.silver * 100);
        double characterWood = (double) characterResources.wood;
        byte characterHealth = (byte) characterResources.health;
        // Установка значения characterHelpersNumber в зависимости от значения hasHelper
        byte characterHelpersNumber = (byte) (characterResources.hasHelper ? 1 : 0);


        Character character = new Character(
                characterGold,
                characterSilver,
                characterWood,
                characterHealth,
                characterHelpersNumber
        );

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}
/*
Часто при обновлении программ необходимо поддерживать старый код. Доработайте код новой версии игры-стратегии, чтобы он
поддерживал параметры из старой версии:

    Поле gold типа long необходимо сохранить в переменную characterGold типа int (точно известно, что значение параметра
    gold меньше 2 000 000 000).
    Поле silver типа byte необходимо сохранить как переменную characterSilver типа int, предварительно умножив её на 100.
    Поле wood типа short необходимо сохранить как переменную characterWood типа double.
    Поле health типа long необходимо сохранить как переменную characterHealth типа byte (точно известно, что значение
    параметра health меньше 100).
    Поле hasHelper типа boolean необходимо сохранить как переменную characterHelpersNumber типа byte. Если параметр
    hasHelper равен true, то в переменную characterHelpersNumber сохранить единицу, если false — ноль.

        Обращаться к параметрам класса Resources необходимо через characterResources.{параметр}.
    Чтобы привести long characterResources.gold к типу int, нужно использовать явное приведение типов через (int).
    characterResources.silver имеет тип byte, а characterSilver — тип int. Java сама приведёт данные к нужному типу
    благодаря неявному расширению.
    characterResources.wood имеет тип short, а characterWood — тип double. Здесь Java сама приведёт данные к нужному
    типу благодаря неявному расширению.
    Чтобы привести long characterResources.health к типу byte, нужно использовать явное приведение типов через (byte).
    boolean нельзя привести к типу byte с помощью приведения типов, необходимо использовать if.
 */
