/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author k.mhanna
 */
public class MissingNumbers {
    public int findMissingNumberNotGood(ArrayList<Integer> myList){
        int missingNbr = 0;
        ArrayList<Integer> localList = myList;
        
        Collections.sort(myList);
        
        Integer currentNbr = null;
        for (int i : myList){
            System.out.println("currentNbr: "+currentNbr);
            System.out.println("myList.get(i): "+myList.get(i));
            if (currentNbr == null){
                currentNbr = myList.get(i);
            } else {
                missingNbr = Objects.equals(currentNbr, myList.get(i)) ? 0 : currentNbr;  
                if (missingNbr != 0){
                    return missingNbr;
                }
            }
            currentNbr++;
        }
        
        return 0;
    }

    /**
     * Get the missing Number in a series of integers
     * for the time being, we can only have 1 missing integer
     * in the sequence
     * @param myList
     * @return 
     */
    public int findMissingNumber(List<Integer> myList){
        Integer total = 0;
        
        //total = myList.stream().map((i) -> myList.get(i)).reduce(total, Integer::sum);
        for (Integer i : myList){
            total += i;
        }
        int n = myList.size() +1;
        Integer sumAll = (n * (n + 1))/2;
        
        return sumAll- total;
        
    }


}
