package JavaCore1.module1.sptint1.theme04.task0406.task02;

class Hamster {
    String name;      // Имя
    double weight;    // Вес
    int age;          // Возраст
    String color;     // Цвет
    boolean isFluffy; // Пушистый
    boolean isWinner; // Победитель прошлых конкурсов

    public Hamster(
            String hamsterName,
            double hamsterWeight,
            int hamsterAge,
            String hamsterColor,
            boolean isFluffyHamster,
            boolean isWinnerHamster
    ) {
        name = hamsterName;
        weight = hamsterWeight;
        age = hamsterAge;
        color = hamsterColor;
        isFluffy = isFluffyHamster;
        isWinner = isWinnerHamster;
    }
}
