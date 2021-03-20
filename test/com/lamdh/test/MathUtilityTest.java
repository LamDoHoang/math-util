/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamdh.test;

import com.lamdh.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    //đật tên hàm theo chuẩn dân test phần mềm, QA/QC
    @Test //biến hàm này thành main. Shift F6 để chạy
    public void testFactoricalGivenRightArgumentReturnGoodResult(){
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        assertEquals(expected, actual);
    }
}
