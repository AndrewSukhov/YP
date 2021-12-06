package JavaCore1.module1.sptint1.theme03.task0303;

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year;
    boolean isRainyMonth;

    WeatherCalendar (String monthName, int monthNumberOfDays) {
        this.month = monthName;
        this. numberOfDays = monthNumberOfDays;
        this.year = 2020;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
}
