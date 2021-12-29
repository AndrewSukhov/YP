package JavaCore1.module1.sptint2.theme10.task1006;

class TezlaTruck {
    protected double maxSpeedByDirt;

    public TezlaTruck() {
        maxSpeedByDirt = 30;
    }

    public void accelerateByDirt() {
        if (speed < maxSpeedByDirt) {
            speed += acceleration * 0.5;
        }
    }

    public void brakeByDirt() {
        if (speed > 0) {
            speed -= brakingSpeed * 0.5;
        }
    }
}
