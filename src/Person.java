public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
@Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        if (obj.getClass() != this.getClass()) return false;
        Person otherCastPerson = (Person) obj;
        if (this.firstName.equals(otherCastPerson.firstName) && this.lastName.equals(otherCastPerson.lastName)) return true;

        return false;
    }

    public int hashCode(String firstName, String lastName) {
        return hashCode(this.firstName, this.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

}
