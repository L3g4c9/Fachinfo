public class Schrittzaehler {
    private String datum;
    private int steps;

    public Schrittzaehler(String datum) {
        this.datum = datum;
        this.steps = 0;
    }

    public void incrementSteps() {
        this.steps++;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Am " + this.datum + " bin ich " + this.steps + " Schritte gegangen!";
    }
}
