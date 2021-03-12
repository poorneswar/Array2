/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array2;

/**
 *
 * @author prudvi
 */
public class Array2 {
     public static void main(String[] args) {
        int [] ArrayNumbers = {10,20,30,40,60};
        int number = 30;
        ArrayNumber(ArrayNumbers, number);
       
    }
    public static void ArrayNumber(int[] array, int n){
       
        for(int i=0; i<array.length; i++){
            if(array[i]>n ){
                System.out.println(array[i]);
                
            }
            
        }
    }  
}
