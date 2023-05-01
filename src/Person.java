import java.util.Objects;
public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person () {
        this(null, null, 0);
    }

//Java Standard Methode
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        if (obj.getClass() != this.getClass()) return false;
        Person otherCastPerson = (Person) obj;
        if (this.age == otherCastPerson.age && this.lastName.equals(otherCastPerson.lastName)) return true;

        return false;
    }
    //Java Standard Methode
    @Override
    public Person clone () {
        Person neuePerson = new Person(this.firstName, this.lastName, this.age);
        return neuePerson;
    }

   //Java Standard Methode
   /* public int hashCode (String firstName, String lastName, int age) {
        return firstName.hashCode() + lastName.hashCode() + age;
    }
    */
    public int hashCode (String firstName, String lastName, int age) {
        return Objects.hash(firstName,firstName,age);
    }

    /*public int hashCode(String firstName, String lastName, int age) {
        return hashCode(this.firstName, this.lastName, this.age);
    }*/
    //Java Standard Methode
    public String toString () {
        return "firstName: " + firstName + " lastName: " + lastName + " age: " + age;
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
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

}
