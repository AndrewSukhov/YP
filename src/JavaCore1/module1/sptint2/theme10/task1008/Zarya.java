package JavaCore1.module1.sptint2.theme10.task1008;

class Zarya extends Mir { // доступ к любым изменениям класса запрещён
    protected Zarya() {
        energyReserve = 10;
        oxygenLevel = 0;
    }

    protected Zarya(double initialOxygenLevel, double initialEnergyLevel) {
        energyReserve = initialEnergyLevel + 15;
        oxygenLevel = initialOxygenLevel + 15;
    }

    void activateModule() {
        flushEnergy();
    }

    void turnSolarPanels() {
        System.out.println("Поворот солнечных панелей для накопления энергии...");
        energyReserve += 15;
    }

    void flushEnergy() {
        System.out.println("Сброс энергии...");
        energyReserve = 0;
    }
}
