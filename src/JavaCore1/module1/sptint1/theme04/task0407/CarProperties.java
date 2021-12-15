package JavaCore1.module1.sptint1.theme04.task0407;

class CarProperties {
    String maxSpeed; // максимальная скорость
    byte initialScore; // начальное количество очков
    double acceleration; // ускорение
    int nitroLevel; // уровень закиси азота

    public CarProperties(String maxSpeed, float acceleration, int nitroLevel) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.nitroLevel = nitroLevel;
    }
}