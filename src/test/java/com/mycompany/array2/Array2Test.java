/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class Array2Test {
    
    public Array2Test() {
    }

    

    @Test
    public void testArrayNumber() {
        System.out.println("ArrayNumber");
        int[] array = {10,20,30,40,60};;
        int n = 30;
        Array2.ArrayNumber(array, n);
    }
    
}
