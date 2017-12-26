
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000; 
        this.gourmetSold = 0;
        this.economicalSold = 0;
    }

    public double payEconomical(double cashGiven) {
        double lunchPrice = 2.50;
        if(cashGiven >= lunchPrice){
            this.cashInRegister+=lunchPrice;
            this.economicalSold++;
            return cashGiven - lunchPrice;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        double lunchPrice = 4.00;
        if(cashGiven >= lunchPrice){
            this.cashInRegister+=lunchPrice;
            gourmetSold++;
            return cashGiven - lunchPrice;
        }
        return cashGiven;
    }
    public boolean payGourmet(LyyraCard card) {
        double lunchPrice = 4.00;
        if(card.balance() >= lunchPrice){
            gourmetSold++;
           return card.pay(lunchPrice);
            
        }
        return false;
    }
    
public boolean payEconomical(LyyraCard card) {
        double lunchPrice = 2.50;
        if(card.balance() >= lunchPrice){
            economicalSold++;
           return card.pay(lunchPrice);
            
        }
        return false;
    }

public void loadMoneyToCard(LyyraCard card, double sum){
    if(sum > 0){
    card.loadMoney(sum);
    this.cashInRegister+= sum;
    } 
}

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}