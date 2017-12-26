
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public boolean less(Money compared){
        if(this.euros<compared.euros){
            return true;
        } else if(this.euros == compared.euros){
            return this.cents < compared.cents;
        } else{
            return false;
        }
    }
    
    public Money plus(Money money){
        return new Money(money.euros+this.euros, money.cents+this.cents);
    }
    
    public Money minus(Money money){
        if(this.less(money)){
            return new Money(0, 0);
        } else if(this.cents<money.cents){
            return new Money((this.euros-money.euros)-1, (100-money.cents));
        } else{
            return new Money(this.euros-money.euros, this.cents-money.cents);
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
