public class Professor extends Money  {
    private String fachgebiet;
    private int gehalt;
    private  String currency2;

    public Professor(String firstname, String lastname, int age, int amount, String currency, String fachgebiet, int gehalt, String currency2) {
        super(firstname, lastname, age, gehalt, currency);
        this.fachgebiet = fachgebiet;
        this.gehalt = gehalt;
        this.currency2 = currency;
    }
    public Professor() {
        this(null, null, 0, 0, null, null, 0, null);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Professor)) return false;
        if (!super.equals(obj)) return false;
        Professor otherCastProfessor = (Professor) obj;
        if (this.gehalt == otherCastProfessor.gehalt && this.fachgebiet.equals(otherCastProfessor.fachgebiet)) return true;

        return false;
    }
    /*@Override
    public Professor clone() {
        super.clone(firstName, lastName, age);
        Professor neueProfessor = new Professor();
        return neueProfessor;
    }*/
    @Override
    public Person clone() {
        Professor neueProfessor = new Professor();
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.fachgebiet.hashCode() + this.gehalt;
    }
    @Override
    public String toString() {
        return super.toString() + " Fachgebiet: " + fachgebiet + " Gehalt: " + gehalt;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }
    public String getFachgebiet() {
        return this.fachgebiet;
    }
    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public int getGehalt() {
        return this.gehalt;
    }
    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }
    public String getCurrency2() {
        return this.currency2;
    }
}
