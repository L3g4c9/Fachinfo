abstract class Mitarbeiter extends Person{
    private int mitarbeiterID;
    private float gehalt;
    private Einsatzgebiet einsatzgebiet;

    public Mitarbeiter(String name, int geburtsJahr, int mitarbeiterID, float gehalt, Einsatzgebiet gebiet) {
        super(name, geburtsJahr);
        this.mitarbeiterID = mitarbeiterID;
        this.gehalt = gehalt;
        this.einsatzgebiet=gebiet;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +"\nGeburtsjahr: " + this.getGeburtsJahr();
    }
}
