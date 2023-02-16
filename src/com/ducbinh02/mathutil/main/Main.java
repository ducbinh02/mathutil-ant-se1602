/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ducbinh02.mathutil.main;

import com.ducbinh02.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {
    //dan dev phai co trach nhiem kiem tra xem code minh da chay dung chua truoc khi lap rap no
    //co nhieu quy tac dat ten ham cho viec kiem thu ham 
    //thuong ten ham se bao ham y nghia cua viec kiem thu 
    //vd testFactorialGivenRightArgumentRunsWell de test ham tinh giai thua
    //   trong tinh huong - case dua n dung chuan thi ta hy vong - expected
    //   ham chay ngon nhu thiet ke, vd n = 5 thi ham phai tra ve 120
    //tuc la 5! hy vong ham tinh ra
    public static void main(String[] args) throws IllegalAccessException {
        
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
        
    }
    
    //Thiet ke ham getF() la chi tinh n! tu 0..20
    //Neu dua n < 0 hoac n > 20 thi ham se khong tinh, chui bang cach nen ra exception
    //Thuc te ham getF() khi chay co lam duoc nhu thiet ke hay khong thi phai test moi biet duoc
    public static void testFactorialGivenWrongArgumentThrowsException() throws IllegalAccessException{
        //Test case #4: Test getFactorial with n = -5, wrong argument 
        //      Expected value: an exception is thrown
        //                      IllegalArgumentException
        System.out.println("Test -5!: expected = Illegal Argument Exception is thrown" );
        MathUtility.getFactorial(-5);
        
        
    }
    
    public static void testFactorialGivenRightArgumentRunsWell() throws IllegalAccessException{
        
        //Test Case #1: Test getFactorial with n = 0
        //      Expected value: 1 - hy vọng đưa n = 0 vào thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "!: expected = " + expectedValue + " | actual: " + actualValue);
        
        
        //Test case #2: Test getFactorial with n = 1
        //      Expected value: 1 - hy vong ham tra ve 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); //thuc te ham chay
        System.out.println("Test " + n + "!: expected = " + expectedValue + " | actual: " + actualValue);
        
        //Test case #3: Test getFactorial with n = 3
        //      Expected value: 6
        System.out.println("Test 3!: expected = 6 | actual: " + MathUtility.getFactorial(3));
        
        
    }
}
