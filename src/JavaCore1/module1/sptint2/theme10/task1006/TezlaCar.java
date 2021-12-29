package JavaCore1.module1.sptint2.theme10.task1006;

class TezlaCar {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TezlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    private void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}
