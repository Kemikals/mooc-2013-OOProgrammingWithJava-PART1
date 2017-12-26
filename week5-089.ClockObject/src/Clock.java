public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
    
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
       this.hours = new BoundedCounter(23);
       this.hours.setValue(hoursAtBeginning);
       this.minutes = new BoundedCounter(59);
       this.minutes.setValue(minutesAtBeginning);
       this.seconds = new BoundedCounter(59);
       this.seconds.setValue(secondsAtBeginning);
    }
     
    public void tick() {
        this.seconds.next();
        if(this.seconds.getValue() == 0){
            this.minutes.next();
        }
        if(this.minutes.getValue() == 0 && this.seconds.getValue() == 0){
            this.hours.next();
        }
             
        }
                 
     
    @Override
    public String toString() {
        // returns the string representation
        return ((this.hours.getValue()>=10) ? "" + this.hours.getValue() : "0"+this.hours.getValue()) + ":"+
               ((this.minutes.getValue()>=10) ? "" + this.minutes.getValue() : "0"+this.minutes.getValue()) + ":" +
               ((this.seconds.getValue()>=10) ? "" + this.seconds.getValue() : "0"+this.seconds.getValue());
    }
}