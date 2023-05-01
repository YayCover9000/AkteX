public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public int getAmount() {
        return this.amount;
    }
    public String getCurrency() {
        return this.currency;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Money)) return false;
        Money otherCastMoney = (Money) obj;
        boolean currencyEquals = (this.currency == null && otherCastMoney.currency == null) || (this.currency != null && this.currency.equals(otherCastMoney.currency));
        return this.amount == otherCastMoney.amount && currencyEquals;
    }
    public String toString() {
        return this.amount + " " + this.currency;
    }

}
