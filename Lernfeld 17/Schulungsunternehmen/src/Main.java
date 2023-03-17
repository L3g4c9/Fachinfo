public class Main {
    public static void main(String[] args) {
        Verwaltung buero1 = new Verwaltung("papierschieber", "__");
        Lehre buero2 = new Lehre("AAA", "__");
        Angestellt a1 = new Angestellt("Hans Dieter", 1977, 123123, 70000 ,buero1);
        Angestellt a2 = new Angestellt("Petra Hase", 2001, 666, 8797979, buero2);
        Freelancer a3 = new Freelancer("Juergen Dose", 1990, 10009, 1434212, buero2);
        System.out.println(a3);

    }
}