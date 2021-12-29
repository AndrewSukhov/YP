package JavaCore1.module1.sptint2.theme10.task1007.task02;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        speed += autoPilotAcceleration;
        // исправьте метод для ускорения при автопилоте
    }

    // переопределите метод для ускорения

    // переопределите метод для торможения
}
