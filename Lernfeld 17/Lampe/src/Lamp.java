public class Lamp {
    private int watt;

    public Lamp(int watt) {
        this.watt = watt;
    }

    public int annualPowerConsumption(int hoursPerDay) {
        int result = (this.watt * 10 * 365) /1000;
        return result;
    }

    public int getWatt() {
        return this.watt;
    }
}
