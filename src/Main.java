import javax.security.auth.login.AccountLockedException;

public class Main {
    public static void main(String[] args) {
        Person jooohn = new Person("John", "Dummy", 20);
        Person jooohn2 = new Person("John", "Dummy", 20);
        Person richy = new Person("Richatr", "Soliman",25);
        Person nullTest = null;


        System.out.println(jooohn.equals(jooohn2));
        System.out.println(jooohn.equals(richy));
//        System.out.println(nullTest.equals(jooohn));
        System.out.println(jooohn.equals(nullTest));

        Money income = new Money(100, "EUR");
        Money expenses = new Money(55, "EUR");
        boolean balance = income.equals(expenses);
        System.out.println("Balance: " + balance);

        System.out.println(income.toString());
        System.out.println(expenses.toString());

        Person clonePerson = jooohn.clone();
        System.out.println(clonePerson.getFirstName() + " " + clonePerson.getLastName() + " " + clonePerson.getAge());


    }
}