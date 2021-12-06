package JavaCore1.module1.sptint1.theme03.task0303;

public class Praktikum {
    public static void main(String[] args) {
        WeatherCalendar calendar = new WeatherCalendar("Октябрь", 31);

        String[] octoberWeather = new String[]{
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Солнечно",
                "Солнечно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Облачно",
                "Дождь",
                "Дождь",
                "Облачно",
                "Солнечно",
                "Дождь",
                "Пасмурно",
                "Дождь",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Солнечно",
                "Облачно"
        };

        for (int i = 0; i < calendar.numberOfDays; i++) {
            if (octoberWeather[i].equals("Дождь")) {
                calendar.addRainyDay();
            }
        }

        // Проверить, был ли месяц дождливым. Если да - установить значение isRainyMonth
        if (calendar.rainyDays > 15) {
            calendar.isRainyMonth = true;
        }

        System.out.println(calendar.month + " " + calendar.year + " года. "
                + calendar.rainyDays + " дней шёл дождь.");

        // Проверить значение isRainyMonth
        if (calendar.isRainyMonth) {
            System.out.println("Это был дождливый месяц.");
        } else {
            System.out.println("Этот месяц был довольно сухим.");
        }
    }
}
/*
Доработайте код программы, которая анализирует погоду за месяц и определяет, был ли он дождливым.
Сейчас поля класса WeatherCalendar инициализируются некорректно. Исправьте это. Вы должно учесть, что:
Значения полей month и numberOfDays должны присваиваться в конструкторе. Для этого объявите его
с двумя параметрами — monthName и monthNumberOfDays, а при вызове передайте в качестве аргументов
значения «Октябрь» и «31».
Полям rainyDays и isRainyMonth должны присваиваться значения по умолчанию
(сейчас они инициализируются явно).
Поле year должно быть проинициализировано при объявлении на уровне класса.
Сохраните в него значение 2020.
Кроме того, внутри WeatherCalendar допишите метод addRainyDay() — он увеличивает
переменную rainyDays на единицу. Также нужно дописать код условных выражений.
Если дождливых дней в месяце больше 15, необходимо присвоить переменной isRainyMonth значение true.
Чтобы напечатать сообщение-вывод, нужно обратиться к этой переменной.

Переменные rainyDays и isRainyMonth нужно удалить из класса Praktikum.
Полю year нужно присвоить значение 2020 сразу при объявлении в классе.
У конструктора класса WeatherCalendar должно быть два параметра: String monthName,
int monthNumberOfDays.
С помощью конструктора нужно создать новый объект — new WeatherCalendar("Октябрь", 31).
Метод addRainyDay() должен считать количество дождливых дней: rainyDays = rainyDays + 1.
Чтобы сравнить поле rainyDays c 15, нужно обратиться к нему calendar.rainyDays.
Если условие выполняется, то calendar.isRainyMonth = true.
В условном выражении, которое отвечает за печать сообщения-вывода,
нужно просто обратиться к булевой переменной: calendar.isRainyMonth.
 */