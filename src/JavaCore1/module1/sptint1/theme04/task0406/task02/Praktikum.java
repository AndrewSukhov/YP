package JavaCore1.module1.sptint1.theme04.task0406.task02;

public class Praktikum {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[]{
                new Hamster("Пушок", 150.5, 2, "Белый", true, false),
                new Hamster("Корочка", 120, 3, "Рыжий", false, false),
                new Hamster("Шалун", 199.9, 4, "Чёрный", false, false),
                new Hamster("Снежинка", 175.9, 4, "Рыжий", false, false),
                new Hamster("Штучка", 199.9, 7, "Чёрный", true, true),
                new Hamster("Баранка", 173.8, 5, "Рыже-белый", true, false),
                new Hamster("Ниндзя", 168, 3, "Рыже-белый", true, false) // Добавьте Ниндзю
        };

        System.out.println("В конкурсе «Рыжий хомяк года» смогут участвовать:");
        for (int i = 0; i < hamsters.length; i++) {
            Hamster hamster = hamsters[i];

            // Составьте условие отбора с помощью дополнительных переменных
            boolean isColor = hamster.color.equals("Рыжий") || (hamster.color.equals("Рыже-белый") && hamster.isFluffy);
            boolean isWeight = (hamster.weight > 150) && (hamster.weight < 200);
            boolean isAge = hamster.age >= 2;

            if (isColor && (isWeight || hamster.isFluffy) && isAge && !hamster.isWinner) {
                System.out.println(" - " + hamster.name);
            }
        }
    }
}
/*
Не зря вы столько времени выбирали хомяка — покупка питомца состоялась.
Теперь у вас дома живёт Ниндзя, и вы решили поучаствовать с ним в конкурсе
«Рыжий хомяк года». Но прежде чем это сделать, с помощью кода проверьте,
соответствует ли Ниндзя условиям конкурса.
Добавьте Ниндзю в массив участников конкурса, учитывая, что он весит 168 грамм,
рыже-белый и пушистый, ему уже 3 месяца, он не побеждал раньше в конкурсах для хомяков.
Проверьте, пройдёт ли Ниндзя отбор, учитывая, что к конкурсу допускаются:
Хомяки с рыжим окрасом;
Хомяки с рыже-белым окрасом, но только если они пушистые;
Хомяки с весом от 150 до 200 грамм. Если хомяк пушистый, то вес не имеет значения;
Хомяки возрастом 2 месяца и старше;
Хомяки, не выигрывавшие раньше этот конкурс.

Добавить Ниндзю в массив нужно так: new Hamster("Ниндзя", 168, 3, "Рыже-белый", true, false).
Хомяк подходит по цвету, если он рыжий или рыже-белый и пушистый.
Логическое выражение получится таким —
hamster.color.equals("Рыжий") || (hamster.color.equals("Рыже-белый") && hamster.isFluffy.
Вес хомяка должен быть больше 150 и меньше 200 —
(hamster.weight > 150) && (hamster.weight < 200).
Хомяк подходит по возрасту, если его возраст больше или равен двум месяцам —
boolean isAge = hamster.age >= 2.
Хомяк сможет участвовать, если у него подходящий цвет, подходящий вес или он пушистый,
хомяк взрослый и не побеждал раньше в этом конкурсе —
isColor && (isWeight || hamster.isFluffy) && isAge && !hamster.isWinner.

 */
