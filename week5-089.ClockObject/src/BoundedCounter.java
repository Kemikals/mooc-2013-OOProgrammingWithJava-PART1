public class BoundedCounter {
    private int value;
    private int upperLimit;
  
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
  
    public void next() {
        this.value = this.value + 1;
        if(this.value > this.upperLimit)
            this.value = 0;
    }
    public void setValue(int value){
        if(value <= this.upperLimit && value >= 0){
            this.value = value;
        }
    }
      
    public int getValue(){
        return this.value;
    }
  
    public String toString() {
        return (this.value>=10) ? "" + this.value : "0"+this.value;
    }
}