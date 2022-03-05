package JavaCore2.module2.sprint5.theme01.task0106.task02;

public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }
/*    public static void main(String[] args) {
        GradesReversed g = new GradesReversed();
        System.out.println(g.serializeGrades(
                new String[]{"Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"}
        ));
    }*/
    public String serializeGrades(String[] grades) {
        String[] strings;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < grades.length; i++) {
            strings = grades[i].split(" ");
                result.append(String.join(",", strings[0].toLowerCase(),
                        strings[1].toLowerCase(), strings[2].toUpperCase(),
                        gradeStringToInt(strings[4])));
                if (i != grades.length - 1)
                    result.append(";");
        }
        return result.toString();
    }
}
/*
Программа по учёту оценок сломалась, но в нашей части системы сохранились бэкапы!
Проведите преобразование, обратное тому, которое было в предыдущем задании.
На вход теперь подаётся массив строк:

Вероника Чехова физика — Безупречно
Анна Строкова математика — Потрясающе
Иван Петров геометрия — Безупречно
Требуется превратить их в одну запись вида "фамилия,имя,предмет,оценка;фамилия,имя,предмет,оценка".
Метод для перевода оценки в строку-число уже реализован.

Чтобы перебрать исходную строку, её сначала придётся разбить на массив строк по пробельному символу.
Затем полученные части строки можно объединить через символ запятой ','.
При разбитии строки по пробелу следует учитывать, что перед записью оценки идут
пробел, тире, пробел ' — '. Пробелы здесь создадут ещё одну группу при разбиении,
то есть важные для вас значения находятся в позициях 0, 1, 2 и 4.
 */
