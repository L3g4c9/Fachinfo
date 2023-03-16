public class Main {
    public static void main(String[] args) {
        Schrittzaehler schritti = new Schrittzaehler("16.03.2023");
        System.out.println(schritti);
        schritti.incrementSteps();
        schritti.incrementSteps();
        schritti.incrementSteps();
        schritti.setSteps(1000);
        System.out.println(schritti);
    }
}