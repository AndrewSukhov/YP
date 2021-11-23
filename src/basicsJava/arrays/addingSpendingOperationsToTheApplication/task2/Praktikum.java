package basicsJava.arrays.addingSpendingOperationsToTheApplication.task2;

import java.util.Scanner;

class Praktikum {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 — Ввести трату");
            System.out.println("0 — Выход");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " RUB");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Неизвестная валюта");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 10000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
                }
            } else if (command == 3) {
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int day = scanner.nextInt();
                System.out.println("Введите размер траты:");
                double expense = scanner.nextDouble();

                moneyBeforeSalary -= expense; // Уменьшите баланс на сумму введённой траты
                expenses[day - 1] += expense; // Сохраните трату в массив

                System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
                // Проверьте текущее значение баланса — не опустилось ли оно ниже отметки в 1000 рублей
                // Выведите предупреждение: "На вашем счету осталось совсем немного. Стоит начать экономить!"
                if (moneyBeforeSalary < 1000) {
                    System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
                }

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
/*
Условия задачи:
Доработайте код приложения. При внесении новой траты баланс на счёте должен уменьшаться на эту же сумму.
Для этого внесите изменения в ветвление третьей команды. После того как пользователь ввёл свои расходы
за определённый день, вычтите их значение из общей суммы сбережений и только потом занесите его в массив.
В случае, когда значение баланса опустится ниже 1000 рублей, должно появляться предупреждение:
«На вашем счету осталось совсем немного. Стоит начать экономить!»
ПОДСКАЗКА:
Чтобы получить новое значение баланса, отнимите от текущего остатка moneyBeforeSalary расходы expense.
Запись трат в массив происходит так же, как и в прошлом тренажёре: expenses[day - 1] = expenses[day - 1] + expense.
Создайте ветвление для проверки остатка средств на балансе. В его условии проверьте, не стало ли значение moneyBeforeSalary меньше 1000.
 */
