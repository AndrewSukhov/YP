package JavaCore2.module2.sprint5.theme01.task0102.task01;

public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        return initial.indexOf(other) == 0;
    }
}
/*
В отделах кадров часто требуется искать работников по первым буквам фамилии.
От перебора бумажных картотек уже отказались — все персональные данные загружены в электронную базу.
Вам нужно реализовать метод boolean startsWith(String initial, String other), который возвращает true,
если фамилия работника initial начинается с подстроки other, иначе false.

Чтобы проверить содержание подстроки в сроке нужно вызвать для initial метод indexOf(), в который передать other.
Если вызов indexOf() вернёт значение 0, то метод вернёт true, иначе false — это нам и нужно.
*/
