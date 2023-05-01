public class Student extends Money {
    private String studiengang;
    private int matrikelnummer;
    private Student[] studenten;
    private int index;
    private final static int MAX_STUDENTEN = 10;

    public Student (String firstname, String lastname, int age, int amount, String currency, String studiengang, int matrikelnummer){
        super(firstname, lastname, age, amount, currency);
        this.studiengang = studiengang;
        this.matrikelnummer = matrikelnummer;
        studenten = new Student[MAX_STUDENTEN];
        index = 0;

    }
    public Student() {
        this(null, null, 0, 0, null, null, 0);
    }
    //Objektverwaltung
    public void addStudent (Student student) {
        if (studenten != null) {
            if (index < MAX_STUDENTEN) {
                studenten[index] = student;
                index++;
            }
        }
    }
    public void deleteStudent () {
        if (studenten != null) {
            if (index > 0) {
                studenten[index - 1] = null;
                index--;
            } else if (index == 0) {
                studenten[index] = null;
            }
        }
    }
    public Student getStudent (int index) {
        if (studenten != null) {
            if (index >= 0 && index < MAX_STUDENTEN) {
                return studenten[index];
            }
        }
        return null;
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
        return super.equals(o) && this.studiengang.equals(otherCastStudent.studiengang) && (this.matrikelnummer == otherCastStudent.matrikelnummer);
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
    public Student[] getStudenten() {
        return studenten;
    }
    public int getIndex() {
        return index;
    }
    public int getNumberOfStudents() {
        return index;
    }

}
