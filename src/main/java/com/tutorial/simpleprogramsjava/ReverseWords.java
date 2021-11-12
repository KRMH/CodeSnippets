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
public class ReverseWords {
    
    public static boolean actionReverseWords (List<String> dictionary){
        System.out.println("Actual dictionary: " + dictionary);
        Collections.reverse(dictionary);
        System.out.println("Reverse dictionary: " + dictionary);
        return true;
    }
    
    
}
