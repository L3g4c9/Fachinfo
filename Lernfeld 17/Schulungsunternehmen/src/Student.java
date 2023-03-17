public class Student extends Person{
    int studentNo;
    String fachrichtung;

    public Student(String name, int geburtsJahr, int studentNo, String fachrichtung) {
        super(name, geburtsJahr);
        this.studentNo=studentNo;
        this.fachrichtung=fachrichtung;
    }
}
