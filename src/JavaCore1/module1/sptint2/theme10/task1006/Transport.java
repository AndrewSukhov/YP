package JavaCore1.module1.sptint2.theme10.task1006;

class Transport {
    private double speed;
    private double maxSpeed;
    private double acceleration;
    private double brakingSpeed;
    private int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}
