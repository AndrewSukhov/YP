package JavaCore1.module1.sptint2.theme11.task1102;

import java.util.Objects;

public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // переопределите метод equals(Object)

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // проверяем адреса объектов
        if(obj == null) return false; // проверяем ссылку на null
        if (this.getClass() != obj.getClass()) return false; // сравниваем классы
        Song otherSong = (Song) obj; // открываем доступ к полям другого объекта
        return Objects.equals(title, otherSong.title) && // проверяем все поля
                Objects.equals(artist, otherSong.artist) && // нужно логическое «и»
                Objects.equals(songwriter, otherSong.songwriter);
                //(pagesNumber == otherSong.pagesNumber); // примитивы сравниваем через ==
    }
}
