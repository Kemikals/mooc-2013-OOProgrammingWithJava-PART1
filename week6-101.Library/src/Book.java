/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class Book {
    private String title;
    private String publisher;
    private int year;
    
    public Book(String title, String publisher, int year){
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * @return the title
     */
    public String title() {
        return title;
    }

    /**
     * @return the publisher
     */
    public String publisher() {
        return publisher;
    }

    /**
     * @return the year
     */
    public int year() {
        return year;
    }
    
    public String toString(){
        return title + ", " + publisher + "," + year;
    }
    
    
}
