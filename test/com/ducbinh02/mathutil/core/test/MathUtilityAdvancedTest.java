/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ducbinh02.mathutil.core.test;

import com.ducbinh02.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
//bao voi JUnit rang code trong class nay tao tach data va ham so sanh rieng biet nhau - DATA DRIVEN TESTING
//tach thi phai co ki thuat nhoi/fill data tro lai lenh so sanh 
//fill tro lai thong qua bien - bien chua value duoc thay doi
//DDT co anh em nuong tua voi Parameterized - tham so hoa data
public class MathUtilityAdvancedTest {

    //chuan bi mang 2 chieu de chua data trong cac test case 
    //se dung
    //quy uoc mang phai la static public
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720},
        };
    }
    
    //map tung cap data o tren vao 2 bien, day 2 bien nay vao ham assertEqual() da quen 
    @Parameterized.Parameter(value = 0) //lay cot 0 cua mang gan vao
    public int n;
    
    @Parameterized.Parameter(value = 1) //lay cot 0 cua mang gan vao
    public long expected;

    //Test thoi
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
