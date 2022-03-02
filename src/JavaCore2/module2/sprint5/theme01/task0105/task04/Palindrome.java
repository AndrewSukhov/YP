package JavaCore2.module2.sprint5.theme01.task0105.task04;

public class Palindrome {
    public boolean isPalindromeLine(String str) {
        StringBuilder word = new StringBuilder(str.toLowerCase());
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).isBlank()) {
                word.deleteCharAt(i--);
            }
        }
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        System.out.println(word);
        return reversedWord.toString().equals(word.toString());
    }
}
/*
Ваш метод public boolean isPalindromeLine(String str) из прошлого задания работает,
но не совсем оптимально. Усовершенствуйте его так, чтобы он мог обрабатывать не
только отдельные слова, но и целые строки с пробелами. Такие, как, к примеру, «Молебен о коне белом».

Для начала нужно привести строку к единому регистру и убрать из неё все пробелы.
Тогда задача сведётся к предыдущей.
Удалить проблемы можно циклом по всем элементам StringBuilder. Устанавливаем индекс в
значение 0, далее идём циклом, ищем пробел. Если нашли — удаляем его.
После удаления всех пробелов, можно создать ещё один StringBuilder и передать ему как
аргумент предыдущий StringBuilder, перевернуть его через reverse(), и затем сравнить полученные строки.
 */