/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author k.mhanna
 */
public class Main {
    
    public static void main (String [] args){
        //System.out.println (checkValue ("Hello World"));
        //System.out.println (distClosestNumbers());
        //Palindrome p = new Palindrome();
        //System.out.println(p.verifyPalyndrome("malayalam"));
        //System.out.println(p.verifyPalyndrome("123321"));
        //MissingNumbers mn = new MissingNumbers();
        List myList = new ArrayList();
        myList.add(3);
        myList.add(7);
        myList.add(1);
        myList.add(2);
        myList.add(8);
        myList.add(4);
        myList.add(5);
        //System.out.println("mn.findMissingNumber(myList): "+ mn.findMissingNumber(myList));
        //System.out.println("SumIntegers.sumOfTwo(myList, 10): "+ SumIntegers.sumOfTwo(myList, 10));
        //System.out.println("SumIntegers.sumOfTwo(myList, 10): "+ SumIntegers.sumOfTwo(myList, 19));
        List myList2 = new ArrayList();
        myList2.add(3);
        myList2.add(7);
        myList2.add(11);
        myList2.add(21);
        myList2.add(81);
        myList2.add(4);
        myList2.add(1);
        
        List<String> dictionary = new ArrayList<>();
        dictionary.add("apple");
        dictionary.add("apple");
        dictionary.add("pear");
        dictionary.add("pie");
        System.out.println("Segmentation.verifySegmentation: "+ ReverseWords.actionReverseWords(dictionary));
        //System.out.println("Segmentation.verifySegmentation: "+ Segmentation.verifySegmentation(dictionary, "applepie"));
    }
    
    private static int distClosestNumbers(){
        int [] testArray = {1, 10, 5, 30, 23, 12};
        
        Arrays.sort(testArray);
        int oldArrayInt = -99;
        int oldDif = 99;   
        for (int arrayInt : testArray){
           int dif = arrayInt - oldArrayInt;
           oldDif = dif > oldDif ? oldDif : dif;
           oldArrayInt = arrayInt;
           
        }
        return oldDif;
        
        
    }
    private static Boolean checkValue (String strValue){
        return "Hello World".equals(strValue);
    } 
    
}
