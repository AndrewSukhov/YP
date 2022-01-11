package JavaCore1.module1.sptint3.theme15.task1505;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practicum {
    // объявите поле для ссылки на карту (англ. map link)
    String mapLink = "https://recyclemap.ru/";
    public static final List<RecyclableMaterial> materials = getMaterials();
    public static final Map<MaterialType, String> containers = getContainers();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();

        String commandValue = scanner.nextLine();
        /* в зависимости от команды выполните следующие действия:
           map - вывести на экран ссылку на карту;
           recyclability - 1. напечатать сообщение "Введите код переработки:",
                           2. добавить ввод кода (целое число),
                           3. вызвать метод isRecycled;
           bonus - 1. напечатать сообщение "Введите количество вторсырья, кг:",
                   2. добавить ввод значения,
                   3. расчитать бонус, умножив вес на коэффициент:
                       если вес меньше 10 кг, то коэффициент 10, иначе - 15,
                   4. вывести сообщение "Количество бонусных баллов: <баллы>."
        */

    }

    // добавьте модификаторы в заголовок метода
    ...  void isRecycled(int code) {
        for (RecyclableMaterial material : materials) {
            if (material.getCode() == code) {
                System.out.print("Это " + material.getDescription() + ". ");
                if (material.isRecyclable()) {
                    System.out.println("Положите его в контейнер с типом «" + containers.get(material.getType()) + "».");
                } else {
                    System.out.println("Он не подходит для вторичной переработки.");
                }
                return;
            }
        }
        System.out.println("Материал с таким кодом не найден.");
    }

    // добавьте модификаторы в заголовок метода
    ... Map<MaterialType, String> getContainers() {
        Map<MaterialType, String> containers = new HashMap<>();
        containers.put(MaterialType.PLASTIC, "Пластик");
        containers.put(MaterialType.METAL, "Пластик");
        containers.put(MaterialType.GLASS, "Стекло");
        containers.put(MaterialType.PAPER, "Бумага");
        containers.put(MaterialType.UNSORTED_WASTE, "Общий мусор");

        return containers;
    }

    public static void printMenu() {
        System.out.println("Введите одну из команд: ");
        System.out.println(ChatCommand.MAP + " - посмотреть карту с пунктами приёма вторсырья.");
        System.out.println(ChatCommand.RECYCLABILITY + " - проверить по коду на упаковке, подходит ли материал для переработки.");
        System.out.println(ChatCommand.BONUS + " - рассчитать количество бонусных баллов.");
    }

    public static List<RecyclableMaterial> getMaterials() {
        List<RecyclableMaterial> materials = new ArrayList<>();

        materials.add(new RecyclableMaterial(1, MaterialType.PLASTIC, true, "полиэтилентерфталат"));
        materials.add(new RecyclableMaterial(2, MaterialType.PLASTIC, true, "полиэтилен высокой плотности"));
        materials.add(new RecyclableMaterial(3, MaterialType.PLASTIC, false, "поливинилхлорид"));
        materials.add(new RecyclableMaterial(4, MaterialType.PLASTIC, true, "полиэтилен низкой плотности"));
        materials.add(new RecyclableMaterial(5, MaterialType.PLASTIC, true, "полипропилен"));
        materials.add(new RecyclableMaterial(6, MaterialType.PLASTIC, false, "полистирол"));
        materials.add(new RecyclableMaterial(7, MaterialType.PLASTIC, false, "другие виды пластика"));
        materials.add(new RecyclableMaterial(20, MaterialType.PAPER, true, "гофрированный картон"));
        materials.add(new RecyclableMaterial(21, MaterialType.PAPER, true, "прочий картон"));
        materials.add(new RecyclableMaterial(22, MaterialType.PAPER, true, "бумага"));
        materials.add(new RecyclableMaterial(
                23, MaterialType.PAPER, false, "полиграфический картон (открытки, обложки книг и т.д.)"));
        materials.add(new RecyclableMaterial(40, MaterialType.METAL, true, "железо"));
        materials.add(new RecyclableMaterial(41, MaterialType.METAL, true, "алюминий"));
        materials.add(new RecyclableMaterial(70, MaterialType.GLASS, true, "бесцветное стекло"));
        materials.add(new RecyclableMaterial(71, MaterialType.GLASS, true, "зеленое стекло"));
        materials.add(new RecyclableMaterial(72, MaterialType.GLASS, true, "коричневое стекло"));
        materials.add(new RecyclableMaterial(73, MaterialType.GLASS, true, "бутылочное стекло (тёмно-коричневое)"));
        materials.add(new RecyclableMaterial(74, MaterialType.GLASS, true, "бутылочное стекло (светло-коричневое)"));
        materials.add(new RecyclableMaterial(75, MaterialType.GLASS, false, "стекло с малым содержанием свинца"));
        materials.add(new RecyclableMaterial(76, MaterialType.GLASS, false, "хрусталь"));
        materials.add(new RecyclableMaterial(
                77, MaterialType.GLASS, false, "стекло, покрытое медью (электроника, часы)"));
        materials.add(new RecyclableMaterial(
                78, MaterialType.GLASS, false, "стекло, покрытое серебром (зеркало, посуда для сервировки)"));
        materials.add(new RecyclableMaterial(
                79, MaterialType.GLASS, false, "позолоченное стекло (посуда для сервировки)"));

        return materials;
    }
}
/*
Компания «Собираем и перерабатываем» занимается переработкой вторсырья. Она планирует провести акцию: за каждый собранный килограмм вторсырья будут начисляться бонусы. 1 бонус = 1 рубль. Их можно потратить в магазинах партнёров.
Для привлечения внимания к акции, компания решила создать чат-бот, в котором можно будет:

    посмотреть карту с пунктами приёма вторсырья,
    проверить по коду на упаковке, подходит ли материал для переработки,
    а также рассчитать количество бонусных баллов.

Ваша задача — создать этот чат-бот.

Ссылку на карту нужно хранить как константу public static final String MAP_LINK = "https://recyclemap.ru/".
Чтобы перевести введённую команду в тип ChatCommand, используйте метод ChatCommand.valueOf(commandValue).
Для описания действий команды используйте оператор switch.
Метод isRecycled должен быть static, чтобы его можно было вызвать из другого статического метода.
Все переменные в классе RecyclableMaterial — финальные и приватные.
 */
