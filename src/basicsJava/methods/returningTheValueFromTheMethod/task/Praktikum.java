package basicsJava.methods.returningTheValueFromTheMethod.task;

public class Praktikum {

    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }

    public static String findHighestGrossingFilm() {
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;

        // Напишите реализацию нового метода ниже
        if (income1 > income2 && income1 > income3)
            return film1;
        else if (income2 > income1 && income2 > income3)
            return film2;
        else
            return film3;
    }
}
/*
Условие задачи:
Вам нужно дописать реализацию метода findHighestGrossingFilm(), который выбирает
самый кассовый фильм из трёх предложенных вариантов — хитов Джеймса Кэмерона
«Титаник» и «Аватар» и блокбастера Кристофера Нолана «Тёмный рыцарь». Названия фильмов
и их сборы заранее сохранены в соответствующих переменных. Метод должен сравнить суммы
сборов и вернуть значение — название фильма, заработавшего в прокате больше всего.
ПОДСКАЗКА:
Метод должен сравнивать сборы — для этого лучше всего воспользоваться ветвлениями.
Вернуть нужно не сумму сборов, а названия фильмов — для этого используйте оператор return.
Чтобы легче было писать код, рассуждайте так: больше ли бюджет первого фильма бюджета второго,
если да, то больше ли он бюджета третьего, если да — значит надо вернуть название этого фильма.
И так далее.
В коде воспользуйтесь ветвлениями.
 */
