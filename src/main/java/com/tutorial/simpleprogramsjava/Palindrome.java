/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.ArrayList;

/**
 *
 * @author k.mhanna
 */
public class Palindrome {
    /**
     * 
     * @param inputInt
     * @return 
     */
    public boolean verifyPalyndrom (Integer inputInt){
        String inputString = inputInt.toString();
        return verifyPalyndrome(inputString);
    }
    
    /**
     * 
     * @param inputString
     * @return 
     */
    public boolean verifyPalyndrome (String inputString){
        if (inputString.length() < 2){
            return true;
        }
        System.out.println(inputString.charAt(0));
        System.out.println(inputString.charAt(inputString.length()-1));
        if (inputString.charAt(0) == inputString.charAt(inputString.length()-1) ){
            System.out.println(inputString.substring(1, inputString.length()-1));
            return verifyPalyndrome(inputString.substring(1, inputString.length()-1));
        }else{
            return false;
        }
        
    }
    
    
    
    public boolean verifyPalindromeOld (String namePalin){
        ArrayList charPalin = new ArrayList();
        int namePalinLength = namePalin.length(); 
        for (int i =0; i < namePalinLength; i++){
            charPalin.add(namePalin.charAt(i));
            System.out.println(charPalin.get(i) + " " + namePalin.charAt(i));
        }
        
        for (int n=0; n < namePalinLength; n++){
            System.out.println("***********************");
            System.out.println(charPalin.get(n));
            System.out.println(charPalin.get(namePalinLength-n-1));
            System.out.println("***********************");
        }
        
        
        return false;
        
    }
}
