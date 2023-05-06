public class Money extends Person {
    private int amount;
    private String currency;




    public Money(String firstname, String lastname, int age, int amount, String currency) {
        super(firstname, lastname, age);
        this.amount = amount;
        this.currency = currency;
    }
    public Money() {
        this(null, null, 0, 0, null);
    }

    public int getAmount() {
        return this.amount;
    }
    public String getCurrency2() {
        return this.currency;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setCurrency2(String currency2) {
        this.currency = currency2;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Money otherCastMoney)) return false;
        boolean currencyEquals = (this.currency == null && otherCastMoney.currency == null) || (this.currency != null && this.currency.equals(otherCastMoney.currency));
        return this.amount == otherCastMoney.amount && currencyEquals;
    }
    @Override
    public int hashCode() {
        return this.amount + (this.currency == null ? 0 : this.currency.hashCode());
    }
    @Override
    public String toString() {
        return super.toString() + " " + "Hat: " + this.amount + " " + this.currency + " auf dem Konto.";
    }
    @Override
    public Person clone() {
        Money neueMoney = new Money();
        return super.clone();
    }

}
