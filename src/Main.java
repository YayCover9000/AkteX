public class Main {
    public static void main(String[] args) {
        Person jooohn = new Person("John", "Dummy");
        Person jooohn2 = new Person("John", "Dummy");
        Person richy = new Person("Richatr", "Soliman");
        Person nullTest = null;


        System.out.println(jooohn.equals(jooohn2));
        System.out.println(jooohn.equals(richy));
//        System.out.println(nullTest.equals(jooohn));
        System.out.println(jooohn.equals(nullTest));
    }
}