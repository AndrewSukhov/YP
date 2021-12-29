package JavaCore1.module1.sptint2.theme10.task1008;

class Mir { // доступ к любым изменениям класса запрещён
    protected double oxygenLevel;
    protected double energyReserve;
    protected double energyConsumption;
    protected double vibration;
    protected double fuel;

    public Mir() {
        oxygenLevel = 30.0;
        energyReserve = 50.0;
    }

    void stabilize() {
        stabilizeByMainEngine();
    }

    void stabilizeByMainEngine() {
        System.out.println("Стабилизация основным двигателем...");
        if (fuel >= 1000) {
            vibration = 0;
            fuel -= 1000;
        } else {
            System.out.println("Стабилизация невозможна.");
        }
    }

    void stabilizeBySmallEngines() {
        System.out.println("Стабилизация малыми двигателями...");
        if (fuel >= 250) {
            vibration -= 1;
            fuel -= 250;
        } else {
            System.out.println("Стабилизация невозможна.");
        }
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public double getEnergyReserve() {
        return energyReserve;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
}
