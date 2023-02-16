/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ducbinh02.mathutil.core.test;

import com.ducbinh02.mathutil.core.MathUtility;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //kiem thu ngoai le thi sao
    //tuc la ham getF() duoc thiet ke rang neu dua n ca chon
    //thi ham phai nem ra ngoai le
    //tuc la getF(-5) thi EXPECTED == Ngoai le ILLEGAL ARGUMENT EXCEPTION
    //THAY NGOAI LE MUNG ROI NUOC MAT
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException(){
        
        //Test case #5: getF() with a wrong arg: n = -5
        //      Expected: An exeption is throw
        MathUtility.getFactorial(-5);
        //neu chi go lenh tren thi bi mau do do lenh nay gay ra ngoai le, va exception la mau do 
        //nhung cai ham nay minh ki vong ra exception, neu vang ta exception thi dung nhu thiet ke
        //ma dung thiet ke thi PHAI MAU XANH
        // => loi cua ta la chua so sanh, chua nhan dien la da co ngoai le hay chua 
        //ta can them 1 lenh: da co ngoai le chua
        //neu co ngoai le roi => MAU XANH
        //JUnit 4 khong dung ham assert() de do ngoai le
        //JUnit 5 dung ham assert() de do ngoai le 
        
    }
    
    @Test
    //Trong ham nay chua cac test case de test getF()
    //voi n hop le trong khoang tu 0..20
    public void testFactorialGivenRightArgumentReturnsWell() throws IllegalAccessException{
        //Test case #1: test getF() with n = 0
        //      expected: result = 1; hi vong 0! = 1
        assertEquals(1, MathUtility.getFactorial(0));
        
        //Test case #2: test getF() with n = 5
        //      expected: result = 120;
        assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case #3: test getF() with n = 6
        //      expected: result = 720;
        assertEquals(720, MathUtility.getFactorial(6));
        
        //Test case #4: test getF() with n = 4
        //      expected: result = 24;
        assertEquals(240, MathUtility.getFactorial(4));
        
        
        
    }
   
    
}
