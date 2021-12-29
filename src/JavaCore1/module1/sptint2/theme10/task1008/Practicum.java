package JavaCore1.module1.sptint2.theme10.task1008;

public class Practicum {
    private static final double ACCEPTABLE_VIBRATION = 1;

    public static void main(String[] args) {
        ISS spaceStation = new ISS(10, 50, 800);
        System.out.println("Международная космическая станция.");
        System.out.println("Тест #745-093.");
        System.out.println("Уровень кислорода: " + spaceStation.getOxygenLevel());
        System.out.println("Уровень энергии: " + spaceStation.getEnergyReserve());
        System.out.println("Потребление энергии: " + spaceStation.getEnergyConsumption());
        System.out.println("Уровень топлива: " + spaceStation.fuel);

        System.out.println("\nСтыковка нового модуля...");

        Zvezda newModule = new Zvezda();

        spaceStation.moduleDocking(newModule);

        System.out.println("Модуль пристыкован. Проверка систем...");

        System.out.println("Уровень кислорода: " + spaceStation.getOxygenLevel());
        System.out.print("Потребление энергии: " + spaceStation.getEnergyConsumption());
        System.out.println(" (Уровень энергии: " + spaceStation.getEnergyReserve() + ")");
        System.out.print("Уровень вибраций: " + spaceStation.vibration);
        System.out.println(" (Допустимый уровень: " + ACCEPTABLE_VIBRATION + ")");
        System.out.println();

        if ((spaceStation.oxygenLevel < 0)
                || (spaceStation.getEnergyConsumption() > spaceStation.energyReserve)
                || (spaceStation.vibration > ACCEPTABLE_VIBRATION)) {
            System.out.println("⚠️ АВАРИЯ! ⚠️");
            System.out.println("Жизненно важные показатели на недопустимом уровне.");
            System.out.println("Тест #745-093 провален.");
        } else {
            System.out.println("Все показатели в норме.");
            System.out.println("Тест #745-093 успешно пройден.");
            System.out.println("Ваше звание повышено.");
            System.out.println("Тест #745-094 разблокирован.");
        }
    }
}
/*
Перед вами код интерактивного тренажёра для будущих космонавтов, где отрабатываются аварийные ситуации на МКС.
В нём есть классы всех космических модулей, включая старые блоки «Заря» и «МИР». Ваша задача — с помощью
параметров, к которым разрешён доступ, настроить безаварийную работы систем при стыковке с новым модулем «Звезда».
Известно, что:

Система по активации модуля на «Заре» работает неэффективно, что мешает «Звезде» накапливать солнечную энергию.
На станции «ISS» требуется увеличить уровень кислорода и энергетических резервов — сделать это можно только
через подключение «Зари».
Метод стабилизации не срабатывает из-за недостатка топлива. Вместо основного двигателя стоит попробовать
несколько раз задействовать малые.


Метод активации модуля activateModule() в классе Zvezda работает неэффективно и теряет энергию.
Его нужно переопределить так, чтобы он накапливал её с помощью метода turnSolarPanels().
Если ISS будет наследовать у класса Zarya, а не у класса Mir, то получит дополнительный ресурс
energyReserve и oxygenLevel. Измените родительский класс у ISS, а потом вызовите конструктор прежнего
родителя через super.
Метод стабилизации stabilize() в классе ISS нужно переопределить — трижды вызвать внутри него метод
стабилизации малыми двигателями.

 */
