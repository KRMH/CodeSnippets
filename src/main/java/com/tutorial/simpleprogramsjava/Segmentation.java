/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k.mhanna
 */
public class Segmentation {
    /**
     * 
     * @param dictionary
     * @param wordToFind
     * @return 
     */
    public static boolean verifySegmentation (List<String> dictionary, String wordToFind){
        List <String> foundwords = new ArrayList<>();
        
        for (String x : dictionary){
            if (wordToFind.startsWith(x)){
                foundwords.add(x);
                System.out.println("X: " + x);
                System.out.println("wordToFind: " + wordToFind);
                System.out.println("x.length(): " + x.length());
                System.out.println("wordToFind.length(): " + wordToFind.length());
                wordToFind = wordToFind.substring(x.length(), wordToFind.length());
            } else if (wordToFind.endsWith(x)){
                foundwords.add(x);
                wordToFind = wordToFind.substring(1, wordToFind.indexOf(x));                
            }
        }
        
        if (wordToFind.isEmpty()){
            return true;
        }
        return false;
        
    }
    
}
