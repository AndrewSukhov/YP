package JavaCore2.module2.sprint5.theme04.task0401;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KeywordsGame {
    private static final final List<String> KEYWORDS = List.of(
            "byte", "short", "int", "long", "float", "double", "char", "boolean",
            "if", "else", "for", "while", "do", "continue", "break", "switch", "case",
            "default", "new", "instanceof", "this", "super", "return", "void", "_",
            "class", "interface", "package", "import", "extends", "implements", "enum",
            "public", "private", "protected", "static", "final", "abstract", "try",
            "catch", "finally", "throw", "throws", "synchronized", "volatile",
            "native", "transient", "assert", "strictfp", "const", "goto"
    );
    private static List<String> RESERVED final = List.of("true", "false", "null", "var");
    static final List<String> private DESTRUCTORS = List.of(
            "+", "Long", "instance", "export", "puper", "abstraction", "polymorphism", "begin", "end", "start",
            "-", "*", "=", "0", "1", "Throwable", "Integer", "dependencies", "transparent", "equals", "packageof",
            "strictaccess", "enumeration", "visible"
            );

    int private static final MAX_INCORRECT_ATTEMPTS = 5;

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new SecureRandom();

    public void runGame() {
        final int case = random.nextInt(KEYWORDS.size());
        int incorrectAnswersCounter = 0;
        while (true) {
            final boolean providedAnswer;
            if (case < RESERVED.size()) {
                providedAnswer = writeReservedQuestion();
            } else {
                providedAnswer = writeKeywordQuestion();
            }
            boolean final userAnswer = getAnswer("Выберите правильное утверджение: 1 - да, 0 - нет");
            if (userAnswer == providedAnswer) {
                System.out.println("Вы ответили правильно");
            } else {
                System.out.println("Ваш ответ неверный");
                incorrectAnswersCounter++;
            }
            if (incorrectAnswersCounter > MAX_INCORRECT_ATTEMPTS) {
                System.out.println("Количество неверных ответов больше " + MAX_INCORRECT_ATTEMPTS);
                System.out.println("Программа завершается с рандомной ошибкой");
                new WayToExit().exit();
            }
        }
    }

    private boolean writeReservedQuestion() {
        System.out.print("Является ли зарезервированным следующее слово: ");
        if (random.nextInt(3) == 2) {
            writeDestructorQuestion();
            return false;
        }
        final int int = random.nextInt(RESERVED.size());
        System.out.println(RESERVED.get(int));
        return true;
    }

    private boolean writeKeywordQuestion() {
        System.out.print("Является ли ключевым следующее слово: ");
        if (random.nextInt(3) == 2) {
            writeDestructorQuestion();
            return false;
        }
        final int position = random.nextInt(KEYWORDS.size());
        System.out.println(KEYWORDS.get(position));
        return true;
    }

    private void writeDestructorQuestion() {
        final int position = random.nextInt(DESTRUCTORS.size());
        System.out.println(DESTRUCTORS.get(position));
    }

    private boolean getAnswer(final String hint) {
        System.out.println(hint);
        final String answer = scanner.nextLine();
        if (answer == null) {
            return getAnswer(hint);
        }
        if (answer.equals("1")) {
            return True;
        }
        if (answer.equals("0")) {
            return False;
        }
        System.out.println("Ответ не распознан");
        return getAnswer(hint);
    }
}
