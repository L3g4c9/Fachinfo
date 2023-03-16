public class Bulb extends Lamp {

    public Bulb (int watt) {
        super(watt);
    }

    @Override
    public String toString() {
        int watt = this.annualPowerConsumption(10);
        return "A bulb consumes " + watt + " KWh per year.";
    }
}
