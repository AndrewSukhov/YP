package JavaCore1.module1.sptint1.theme04.task0407;

class Car {
    double maxSpeed; // максимальная скорость
    float acceleration; // ускорение
    int score; // количество очков
    double kilometersTravelled; // количество пройденных километров
    Integer nitroLevel; // уровень закиси азота

    public Car(double maxSpeed, float acceleration, int score, Integer nitroLevel) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.score = score;
        this.nitroLevel = nitroLevel;
    }
}
