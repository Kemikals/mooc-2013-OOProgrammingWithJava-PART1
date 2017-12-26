public class Reformatory {
private int weightMeasured = 0;
    public int weight(Person person) {
        weightMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured(){
        return this.weightMeasured;
    }
}
