package JavaCore1.module1.sptint2.theme10.task1008;

class ISS extends Mir {
    // доступ к изменению параметров запрещён
    public ISS(double initialOxygenLevel, double initialEnergyLevel, double initialFuel) {

        // требуется увеличить уровень кислорода и энергетических резервов
        oxygenLevel = initialOxygenLevel;
        energyReserve = initialEnergyLevel;

        // доступ к изменению полей запрещён
        fuel = initialFuel;
        vibration = 0;
        energyConsumption = 20;
    }

    // доступ к изменению метода запрещён
    public void moduleDocking(Zvezda module) {
        connectEnergyCableTo(module);
        connectOxygenCableTo(module);
        stabilize();
    }

    // получен доступ к переопределению метода стабилизации

    // доступ к изменению метода запрещён
    private void connectOxygenCableTo(Zvezda module) {
        double oxygenLosses = (oxygenLevel + module.oxygenLevel) / 2 + 9;
        oxygenLevel -= oxygenLosses;
        vibration += 2;
    }

    // доступ к изменению метода запрещён
    private void connectEnergyCableTo(Zvezda module) {
        energyReserve += module.getEnergyReserve();
        energyConsumption += module.getEnergyConsumption() * 1.3;
        vibration += 2;
    }
}
