package JavaCore1.module1.sptint2.theme10.task1006;

class Train extends Automobile {
    public Train() {
        wheelsNumber = 8;
    }

    private boolean isLocomotive;

    public void turnToLocomotive() {
        isLocomotive = true;
    }

    public void turnToСarriage() {
        isLocomotive = false;
    }
}
