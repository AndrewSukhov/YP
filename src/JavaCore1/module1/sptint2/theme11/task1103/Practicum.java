package JavaCore1.module1.sptint2.theme11.task1103;

import java.util.ArrayList;
import java.util.HashMap;

public class Practicum {
    public static void main(String[] args) {
        // Таблицы для хранения рейтингов фильмов и фильмографии актёров
        HashMap<Actor, ArrayList<Movie>> filmography = new HashMap<>();
        HashMap<Movie, Double> ratings = new HashMap<>();

        Movie ivanVasilievichMovie = new Movie("Иван Васильевич меняет профессию", 1973);
        Movie gentlemenOfFortuneMovie = new Movie("Джентльмены удачи", 1971);
        ratings.put(ivanVasilievichMovie, 8.6);
        ratings.put(gentlemenOfFortuneMovie, 8.5);

        Actor aDemyanenko = new Actor("Александр", "Демьяненко");

        ArrayList<Movie> actorMovies = new ArrayList<>();
        actorMovies.add(ivanVasilievichMovie);
        actorMovies.add(gentlemenOfFortuneMovie);

        filmography.put(aDemyanenko, actorMovies);

        if(filmography.containsKey(new Actor("Александр", "Демьяненко"))) {
            ArrayList<Movie> foundMovies = filmography.get(new Actor("Александр", "Демьяненко"));
            System.out.println("В фильмографии актёра А. Демьяненко найдены следующие фильмы: ");
            for (Movie movie : foundMovies) {
                if(ratings.containsKey(new Movie(movie.title, movie.releaseYear))) {
                    double rating = ratings.get(movie);
                    System.out.println("Фильм " + movie.description() + " с рейтингом " + rating);
                } else {
                    System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Movie.");
                }
            }
        } else {
            System.out.println("Что-то пошло не так... Проверьте реализацию equals и hashCode в классе Actor.");
        }
    }
}
/*
Перед вами часть кода программы, которая по имени актера находит фильмы, где он сыграл.
Вот только сейчас она не запускается. Исправьте это.

Доработайте класс Movie. Реализуйте конструктор с параметрами, где задаётся название и год выхода фильма.
Переопределите методы equals(Object) и hashCode().
Доработайте класс Actor. Реализуйте конструктор с параметрами, где задаётся имя и фамилия актёра.
Переопределите методы equals(Object) и hashCode().

Чтобы создать конструкторы с параметрами, используйте ключевое слово this.
Метод equals(Object) после переопределения должен проверять, что сравниваемые объекты равны,
ни один не равен пустой ссылке, классы и значения полей объектов полностью совпадают.
Для переопределения hashCode() воспользуйтесь методом вспомогательного класса Objects.
Чтобы использовать методы Objects.equals(Object, Object) и Objects.hash(Object...),
нужно импортировать класс Objects.
Поля в equals(Object) и hashCode() должны совпадать.
 */