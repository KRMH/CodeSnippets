/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;


/**
 *
 * @author k.mhanna
 */
public class ReverseString {
    public static void main (String [] args){
        System.out.println(reverseStringBuilder("kristelmhanna"));
        verifyStringMutable ();
        reverseString("kristelmhanna");
    }
    
    private static String reverseStringBuilder(String inputString){
        String result;
        
        StringBuilder sb = new StringBuilder(inputString);
        result = sb.reverse().toString();
        return result;
    }
    
    private static String reverseString(String inputString){
        String result = "";
        char[] inputChar = inputString.toCharArray();
        
        for (int i = inputChar.length - 1; i > -1; i--){
            result = result + inputChar[i];
        }
        
        System.out.println("result: " + result);
        
        return result;
    }
    
    private static void verifyStringMutable (){
        String test1 = "java";
        String test2 = "java";
        System.out.println(test1 == test2);
        System.out.println(test2);
        test2.concat("j2ee");
        System.out.println(test2);
    }
}
