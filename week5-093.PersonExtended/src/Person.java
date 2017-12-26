import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        int todaysDay = Calendar.getInstance().get(Calendar.DATE);
       int todaysMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
       int todaysYear = Calendar.getInstance().get(Calendar.YEAR);
       
       this.birthday = new MyDate(todaysDay, todaysMonth, todaysYear);
    }
    
    
    public int age() {
       
       int todaysDay = Calendar.getInstance().get(Calendar.DATE);
       int todaysMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
       int todaysYear = Calendar.getInstance().get(Calendar.YEAR);
       
       MyDate today = new MyDate(todaysDay, todaysMonth, todaysYear);
       
        return this.birthday.differenceInYears(today);
    }
    
    public boolean olderThan(Person compared) {
        if(this.birthday.earlier(compared.birthday)){
        return true;
    } else{
            return false;
        }
    }
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
