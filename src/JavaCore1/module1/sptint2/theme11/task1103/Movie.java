package JavaCore1.module1.sptint2.theme11.task1103;

import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseYear);
    }
}