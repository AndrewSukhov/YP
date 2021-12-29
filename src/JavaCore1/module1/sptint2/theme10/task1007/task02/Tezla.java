package JavaCore1.module1.sptint2.theme10.task1007.task02;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        // исправьте метод для ускорения при автопилоте
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }

    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    @Override
    public void brake() {
        // переопределите метод для торможения
        if (speed > 0) {
            speed -= brakingSpeed;
        } else {
            speed = 0;
        }
    }
}
