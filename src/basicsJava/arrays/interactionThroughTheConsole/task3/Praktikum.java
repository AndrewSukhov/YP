package basicsJava.arrays.interactionThroughTheConsole.task3;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
        System.out.println("Вы продегустировали пять блюд.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс блюда, которое хотите переместить:");
        System.out.println("0-Ризотто");
        System.out.println("1-Тартар");
        System.out.println("2-Шурпа");
        System.out.println("3-Панна-котта");
        System.out.println("4-Сашими");

        // Считайте из консоли индекс блюда, которое нужно переместить
        int firstIndex = scanner.nextInt();

        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
        // Объявите переменную secondIndex для нового положения (индекса) блюда, считайте его из консоли
        int secondIndex = scanner.nextInt();

        // Сохраните значение блюда под индексом firstIndex в переменную swap
        String swap = dishes[firstIndex];

        // Присвойте блюду с индексом firstIndex значение блюда под индексом secondIndex
        dishes[firstIndex] = dishes[secondIndex];

        // Присвойте блюду с индексом secondIndex значение переменной swap
        dishes[secondIndex] = swap;

        System.out.println("Ваш рейтинг блюд:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);

    }
}
/*
Условие задачи:
Жюри кулинарного конкурса предложено продегустировать пять блюд в таком порядке:
ризотто, тартар, шурпа, панна-котта и сашими. Для определения победителя разработана
новая гибкая система оценки. У каждого из членов жюри есть возможность поменять два
блюда местами в исходном списке (как при дегустации). Например, поставить сашими н
а первое место, если оно понравилось больше всего — ризотто в таком случае отправится
на пятое место.
Напишите программу, которая позволит менять блюда местами. У пользователя (члена жюри)
должна быть возможность выбрать любое блюдо, а потом указать любой номер позиции,
на которую он хочет его поставить.
ПОДСКАЗКА:
Чтобы считать из консоли индексы элементов, введённые пользователем,
воспользуйтесь операцией scanner.nextInt(). Например, int firstIndex = scanner.nextInt();.
Сначала нужно сохранить в переменной swap позицию того блюда, которое пользователь
хочет переместить: String swap = dishes[firstIndex].
Чтобы поменять блюда местами, надо присвоить значение одного элемента другому:
dishes[firstIndex] = dishes[secondIndex].
В переменной swap должно оказаться значение второго из перемещаемых элементов:
dishes[secondIndex] = swap.
 */
