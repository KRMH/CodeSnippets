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
public class SwappingDigits {
    
    
    public static void main (String [] args){
        swappTwoDigits();
    }
    
    private static void swappTwoDigits(){
        int x = 12;
        int y = 24;
        
        y = y + x;
        System.out.println("y: " + y);
        x = y - x;
        System.out.println("x: " + x);
        y = y - x;
        System.out.println("y: " + y);
    }
}
