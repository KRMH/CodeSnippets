/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author k.mhanna
 */
public class LinkedLists {
    /**
     * 
     * @param list1
     * @param list2 
     * @return  
     */
    public static List<Integer> mergeLinkedLists (List<Integer> list1, List<Integer> list2){
        Collections.sort(list1);
        Collections.sort(list2);
        
        int indexList1 = 0;
        int indexList2 = 0;
        List <Integer> mergedList = new ArrayList<>();
        
        if (list1.isEmpty()){
            return list2;
        }
        
        if (list2.isEmpty()){
            return list1;
        }
        
        while (indexList1 < list1.size() || indexList2 < list2.size()){
            
            if (indexList1 >= list1.size()){
                if (!mergedList.contains(list2.get(indexList2))){
                    mergedList.add(list2.get(indexList2));                    
                }
                indexList2++;
                
            } else if (indexList2 >= list2.size() || list1.get(indexList1).compareTo(list2.get(indexList2)) <= 0){
                if (!mergedList.contains(list1.get(indexList1))){
                    mergedList.add(list1.get(indexList1));
                }
                indexList1++;
            } else {
                if (!mergedList.contains(list2.get(indexList2))){
                    mergedList.add(list2.get(indexList2));
                }
                indexList2++;
            }
        }
        
        return mergedList;
    }
}
