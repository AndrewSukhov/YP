package JavaCore1.module1.sptint2.theme11.task1102;

public class Practicum {
    public static void main(String[] args) {
        Song theRockBandSong = new Song("Popular Song", "The Rock Band", "John Doe");
        Song johnDoeSong = new Song("Popular Song", "The Rock Band", "John Doe");

        Song rapSong = new Song("A song about a hard life", "Popular Rapper", "Popular Rapper");

        Song richardRoeSong = new Song("A song about a hard life", "Popular Rapper", "Richard Roe");

        // проверяем рефлексивность
        boolean check0 = false;
        if(johnDoeSong.equals(johnDoeSong)) {
            check0 = true;
        }

        // проверяем симметричность
        boolean check1 = false;
        if(theRockBandSong.equals(johnDoeSong) &&
                johnDoeSong.equals((Object) theRockBandSong)) {
            check1 = true;
        }

        // проверяем на неравенство объекту другого класса
        boolean check2 = false;
        if(!rapSong.equals(42)) {
            check2 = true;
        }

        // проверяем на неравенство пустой ссылке
        boolean check3 = false;
        if(!theRockBandSong.equals(null)) {
            check3 = true;
        }

        // проверяем на правильное сравнение объектов одного класса
        boolean check4 = true;
        if(richardRoeSong.equals(johnDoeSong)) {
            check4 = false;
        }

        // проверяем транзитивность
        boolean check5 = false;
        Song popularSong = new Song("Popular Song", "The Rock Band", "John Doe");
        if(popularSong.equals(theRockBandSong) && theRockBandSong.equals(johnDoeSong)
                && popularSong.equals(johnDoeSong)) {
            check5 = true;
        }

        // проверяем согласованность
        boolean check6 = true;
        boolean result = rapSong.equals(richardRoeSong);
        for (int i = 0; i < 10; i++) {
            if(rapSong.equals(richardRoeSong) != result) {
                check6 = false;
            }
        }

        if(check0 && check1 && check2 &&
                check3 && check4 && check5 && check6) {
            System.out.println("Поздравляем! Метод equals реализован верно.");
        } else {
            System.out.println("Что-то здесь не так. Подумайте над реализацией ещё немного.");
        }
    }
}
/*
Пользователи загрузили в музыкальное приложение большое количество одинаковых треков под разными называниями.
Переопределите метод equals(Object) у класса Song, чтобы можно было находить одинаковые песни. Вам в помощь
в классе Practicum мы реализовали проверку контракта метода — можете опираться на неё.

Сначала нужно проверить ссылки объектов.
Если один из объектов — null или принадлежит к другому классу, — проводить сравнение дальше нет смысла.
Чтобы получить доступ к полям другого объекта, его нужно привести к типу класса (Song), экземпляр при этом
удобно назвать так же — song.
С помощью метода equals(Object, Object) класса Objects нужно поочерёдно сравнить поля обоих объектов —
title, song.title, artist, song.artist, songwriter, song.songwriter.

 */
