/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lamdh.mathutil;

/**
 *
 * @author ASUS
 */
public class MathUtility {
    //ta sẽ tạo các hàm trong class này fake y chang class Math của JDK
    //các hàm sẽ dùng chung ở nhiều nơi, làm tiện ích dùng chung
    //phàm cái gì dùng chung thì ta suy nghĩ tới STATIC
    
    public static final double PT = 3.1415; //giống y chang PI trong class Math của JDK
                                            
    
    
    //hàm tính n! = 1.2.3.4.5.6..n
    //Quy ước: 0! = 1! = 1
    //không có giai thừa âm
    //vì giai thừa tăng cực nhanh về giá trị, 21 tràn kiểu long
    //kiểu long: 10^18, 18 con số 0 tối đa
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. "
                                            + "n must be between 0 to 20");
        if(n == 0 || n == 1)
            return 1; //0! = 1! = 1 tính luôn khỏi vòng for
        long result = 1;
        for(int i = 2; i<=n ; i++){
            result = result*i;
        }
        return result;
//        return n * getFactorial(n-1);//đệ quy
    }
}
