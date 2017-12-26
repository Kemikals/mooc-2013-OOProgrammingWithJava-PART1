public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate comparedDate){
        
        
        
        int daysComparedDate = calculateDaysInDate(comparedDate);
        int thisComparedDate = calculateDaysInDate(this);
       
        if(Math.abs((daysComparedDate-thisComparedDate))<365){
            return 0;
        }
        else{
            return Math.abs(daysComparedDate-thisComparedDate)/365;
        }
    }

    public int calculateDaysInDate(MyDate date){
        int daysInMonths = 0;
        int daysInYears = 0;
        for(int i = 0; i < date.month; i++){
            daysInMonths += 30;
        }
        for(int i = 0; i < date.year - 1; i++){
            daysInYears += 365;
        }
        return daysInMonths + daysInYears + date.day;
    }
}
