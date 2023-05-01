

public class Main {
    //Commit der Frage
    public static void main(String[] args) {
/*
        Money income = new Money(100, "EUR");
        Money expenses = new Money(100, "EUR");
        boolean balance = income.equals(expenses);
        System.out.println("Balance: " + balance);*/

        Money eineZahl = new Money("jp", "ep", 4,100, "EUR");
        System.out.println(eineZahl);



       Professor prof = new Professor("John", "Dummy", 20, 1000, "EUR", "Informatik", 100, "EUR");
        System.out.println(prof.toString());

        Professor profJapanisch = new Professor("Herman", "Konichiwa", 26, 10, "YEN", "Japanisch", 1000, "YEN");
        System.out.println(profJapanisch.toString());

    }
}