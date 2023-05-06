

public class Main {
    //Commit der Frage
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Professor prof = new Professor("John", "Dummy", 20, 1000, "EUR", "Informatik", 100, "EUR");
        Professor profJapanisch = new Professor("Herman", "Konichiwa", 26, 10, "YEN", "Japanisch", 1000, "YEN");
        Student Lauri =  new Student("Lauri", "Love", 24, 10000, "EUR", "Umweltinformatik", 1234554321);
        Student yassuan = new Student("Yassuan", "Hallo", 25, 10, "EUR", "Medizininformatik", 87667890);
        System.out.println(yassuan.equals(Lauri));



    printPerson(Lauri);
    printPerson(prof);
    printPerson(profJapanisch);
    printPerson(yassuan);
    System.out.println(yassuan.hashCode());


    }
    public static void printPerson(Person person) {
        System.out.println("Person: " + person.toString());
    }
}
