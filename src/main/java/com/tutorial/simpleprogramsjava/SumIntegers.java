/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.simpleprogramsjava;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author k.mhanna
 */
public class SumIntegers {
    public static boolean sumOfTwo (List<Integer> listValues, Integer targetSum){
        Set<Integer> foundValues = new HashSet<>();
        for (Integer currentVal : listValues){
            if (foundValues.contains(targetSum-currentVal)){
                return true;
            }
            foundValues.add(currentVal);
        }
        return false;
    }
}
