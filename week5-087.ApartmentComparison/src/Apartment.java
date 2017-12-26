public class Apartment {
 
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int price;
 
    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.price = pricePerSquareMeter * squareMeters;
    }
     
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
     
    public int priceDifference(Apartment otherApartment){
       
        return Math.abs(this.price - otherApartment.price);
    }
     
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.price > otherApartment.price;
    }
}