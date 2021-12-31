package JavaCore1.module1.sptint2.theme11.task1105;

import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Почему второй язык программирования выучить проще, чем первый?");
        post.setContent("Если вы научились водить автомобиль на механике, " +
                "вы можете сесть плюс-минус за любой автомобиль и поехать. " +
                "Вам необязательно ездить именно за тем рулём, " +
                "за которым вы учились в автошколе. " +
                "Может быть, первое время вам будет непривычно в новой машине," +
                " но вы быстро освоитесь.");
        post.setTags(new String[]{"Образование", "Карьера в IT"});

        PostComment comment1 = new PostComment();
        comment1.setText("Отличная статья!");
        comment1.setWhoLiked(new String[] { "Lera93", "934Vasya1" });

        PostComment comment2 = new PostComment();
        comment2.setText("Тема не раскрыта :(");
        comment2.setWhoLiked(new String[] { "Petya070707", "Masha90" });

        PostComment comment3 = new PostComment();
        comment3.setText("❤❤❤");

        ArrayList<PostComment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        post.setComments(comments);

        System.out.println(post);
    }
}
/*
Перед вами часть программы, которая представляет в текстовом виде информацию об опубликованных
на сайте материалах и комментариях к ним. Переопределите метод toString() у классов Post и PostComment так,
чтобы в консоли появилось текстовое представление объекта post. Обратите внимание, что поля обоих классов
закрыты модификатором private — организуйте к ним доступ с помощью методов.

Чтобы задать значения полям, закрытыми модификатором private, нужно написать set- методы.
У поля content нужно вывести не содержание, а длину. Прежде чем это сделать, проверьте,
не передана ли в него пустая ссылка.
Получить содержание массива нужно с помощью метода Arrays.toString().
Чтобы работать с классами ArrayList и Arrays в классе, их нужно импортировать.
 */
