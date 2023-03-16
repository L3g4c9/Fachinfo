public class LEDBulb extends Lamp {

    public LEDBulb (int watt) {
        super(watt);
    }

    @Override
    public String toString() {
        int watt = this.annualPowerConsumption(10);
        return "A bulb consumes " + watt + " KWh per year.";
    }
}
