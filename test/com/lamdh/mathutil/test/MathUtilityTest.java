/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamdh.mathutil.test;

import com.lamdh.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.internal.runners.statements.ExpectException;

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
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //màu đỏ đến theo 2 nghĩa:
        //hàm tính đúng, kỳ vọng sai
        //hàm tính sai, kỳ vọng đúng
        //mỗi lời gọi hàm ở trên gọi là 1 TestCase
        //mọi tình huống test hàm, với 1 đầu vào, và 1 đầu ra
    }
    
    
    //Test ngoại lệ thì testnhư thế nào????
    //Vì khi ngoại lệ xảy ra, app dùng liền, màu đỏ, vì có điều ko ổn xảy ra
    //thêm nữa ngoại lệ ko p 1 value để so sánh, ko bt nó là số mấy chữ gì
    //Ngọai lệ chỉ có thể đc ước lượng, chạm vào nó khi nó xảy ra
    //Ngoại lệ nên đc đọc/diễn giải như sau
    //đưa vào các tình huống dữ liệu sai ví dụ -5, 22, 40
    //tui mún xem ngoại lệ có xảy ra trong tình huống này hay ko
    //nếu có xảy ra thì app chạy đúng thiết kế
    //tức là nếu getFactorial(-5) mà ném ra ngoại lệ IllegalArgumentException, có nghĩa là hàm đúng
    //CÓ NGHĨA LÀ MÀU XANH
    //XANH vì thiết kế nói rằng tình huống -5 p có ngoại lệ
    //vì nếu ngoại lệ XANH thì hàm đúng
    
    @Test (expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-5);//chạy hàm,chưa test
        MathUtility.getFactorial(21);//biết ném ra Ex
        MathUtility.getFactorial(-1);//Ta phải chụp lại Ex
        MathUtility.getFactorial(40);//nếu có thật, hàm dúng, XANH
    }
}


//Việc test dùng màu sắc, dùng thư viện Unit test có quy ước
//nếu tất cả các cặp expect and actual khớp nhau(equals)
//thì coi như hàm chạy đúng mọi tình huống ta đã test -> XANH

//nếu trong tất cả các câp test, có it nhất 1 cặp ko khớp nhau
//ít nhất 1 màu đỏ thì coi như hàm ko ổn ->ĐỎ CHUNG
//Điều này để đảm bảo rằng, phàm hàm mà ta test p dùng hết các tình huống ta đã liệt kê
//vì ta mún thế