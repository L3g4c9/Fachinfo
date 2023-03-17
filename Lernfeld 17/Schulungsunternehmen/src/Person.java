abstract class Person {
    private String name;
    private int geburtsJahr;

    public Person (String name, int geburtsJahr) {
        this.name = name;
        this.geburtsJahr = geburtsJahr;
    }

    public String getName() {
        return name;
    }

    public int getGeburtsJahr() {
        return geburtsJahr;
    }
}
