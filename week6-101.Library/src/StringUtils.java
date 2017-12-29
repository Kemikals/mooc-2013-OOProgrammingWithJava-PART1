/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){

        if(word.toUpperCase().trim().contains(searched.toUpperCase().trim())){
            
            return true;
        } else{
            return false;
        }
    }
}
