public class Student extends Money {
    private String studiengang;
    private int matrikelnummer;

    public Student (String firstname, String lastname, int age, int amount, String currency, String studiengang, int matrikelnummer){
        super(firstname, lastname, age, amount, currency);
        this.studiengang = studiengang;
        this.matrikelnummer = matrikelnummer;
    }
    public Student() {
        this(null, null, 0, 0, null, null, 0);
    }
    //Java Standard Methode
    @Override
    public Person clone() {
        return super.clone();
    }
    @Override
    public String toString() {
        return super.toString() + " Studiengang: " + studiengang + " Matrikelnummer: " + matrikelnummer;
    }
   /* @Override
    public Object hashcode() {
        return super.hashcode() + this.studiengang.hashcode() + this.matrikelnummer;
    }*/

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Student otherCastStudent = (Student) o;
        return super.equals(o) + this.studiengang.equals(o.studiengang) + this.matrikelnummer.equals(o.matrikelnummer);
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }
}
