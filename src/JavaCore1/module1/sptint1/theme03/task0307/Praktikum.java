package JavaCore1.module1.sptint1.theme03.task0307;

public class Praktikum {
    public static void main(String[] args) {
        Bus bus = new Bus(23765);
        String[] passengersTimestamps = new String[]{
                "08:33",
                "09:42",
                "10:43",
                "17:59",
                "18:01",
                "19:15"
        };

        for (int i = 0; i < passengersTimestamps.length; i++) {
            increaseTicketNumber(bus);
            System.out.println("Оплата поездки в " + passengersTimestamps[i]
                    + ". Номер билета: " + bus.ticketNumber);
        }
    }

    private static void increaseTicketNumber(Bus bus) {
        bus.ticketNumber = increase(bus.ticketNumber, 1);
    }

    private static int increase(int numberToIncrease, int increaser) {
       return numberToIncrease = numberToIncrease + increaser;
    }
}
/*
При оплате проезда на автобусе пассажир получает билет с уникальным номером.
Однако текущая реализация программы по учёту поездок выдаёт одинаковые номера
для всех билетов. Исправьте код так, чтобы каждый следующий билет был больше
предыдущего на единицу. Сигнатуры методов increaseTicketNumber и increase
должны остаться неизменными, при этом учтите, что тип возвращаемого значения
в сигнатуру не входит.

Чтобы значение номера билета поменялось, внутри метода increaseTicketNumber
недостаточно просто вызвать метод increase. Нужно присвоить возвращаемое значение —
bus.ticketNumber = increase(bus.ticketNumber, 1).
Метод increase должен возвращать значение. Для этого нужно изменить
его тип с void на int и использовать оператор return.

 */
