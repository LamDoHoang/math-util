/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import com.lamdh.util.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tui mún test 5! có bằng 120 hay ko?
        int n = 5; // coi 5! bằng mấy
        long expected = 120; // tui hy vọng hàm tính ra 120
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected: " + expected + "; actual: " + actual);
        
        //xét trường hợp 2: 0! = mấy
        
        n=0;
        expected = 1; // tui hy vọng hàm tính ra 1
        actual = MathUtility.getFactorial(n);
        
        System.out.println("0! expected: " + expected + "; actual: " + actual);
    }
    
}


//TRONG QUY TRÌNH LÀM PM, DÂN DEV PHẢI CÓ TRÁCH NHIỆM TEST TỪNG HÀM
//TỪNG CLASS MÀ MÌNH VIẾT RA TRƯỚC KHI ĐÓNG GÓI GỬI CHO BÊN QA/QC TEST
//ĐÔC LẬP, TỪNG HÀM, TỪNG CLASS PHẢI DUOC95 TEST CẨN THẬN TRƯỚC KHI CHÚNG
//ĐƯỢC DÙNG ĐỂ PHỐI HỢP VỚI CÁC CLASS KHÁC. TEST NGAY MỨC HÀM. MỨC CLASS
//VỪA HOÀN THIỆN, CHƯA THÈM BÀN VỀ UI, THÌ MỨC ĐỘ TEST SỚM NÀY GỌI LÀ
//UNIT TEST LEVEL - TEST TỪNG ĐƠN THỂ TỪNG ĐƠN VỊ CODE

//Vậy làm sao để test từng hàm từng code
//có nhiều cách để test từng class

//1. Cách 1: Dùng sout(gọi-hàm-cần-test) để in ra giá trị xử lí của hàm
//Dùng trong OOP

//2. Cách 2:Dùng JOptionPane của môn Java Desktop để pop-up 1 cửa sổ in
//kết quả xử lí của hàm để kiểm tra coi hàm chạy đúng hay sai

//3. Cách 3: Dùng LOG FILE, trang web in ra kết quả xử lí của hàm

//dù là cách nào thì ta cũng cần phải in ra giá trị hàm đã xử lí
//gọi là ACTUAL VALUE
// rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán
// trước đó hay không, cái ta hy vọng hàm sẽ trả về - gọi là EXPECTED VALUE

//nếu ACTUAL VALUE == EXPECTED VALUE -> HÀM CHẠY NGON
//                  !=               -> HÀM SAI
//Nguyên tắc của việc test: so sánh ACTUAL VỚI EXPECTED

//3 cách này cùng 1 nguyên tắc gọi hàm để xem actual
//để xử lí ra kết quả mấy
//sau đó dùng mắt để so sánh actual and expected rồi ta tự kết luận
//cách này tiềm ẩn sai sót khi ta phải xem xét quá nhiều cặp VALUE
//VD: hàm giai thừa phải test số âm, số dương, số lớn, nhỏ

//Mỗi N để test ta gọi là 1 tình huống dùng hàm, 1 tình huống test - TEST CASE
//4. Cách 4 không thèm nhìn bằng mắt từng trường hợp expected vs actual
//nhờ máy tình làm giùm, via máy dứ sức biết cách
//máy quát qua tất cả các cặp expected vs actual
//nếu tất cả đề khớp báo tao màu XANH - ĐƯỜNG THÔNG CODE TỐT
// nếu có xuất hiện ít nhất 1 lỗi
//BÁO MÀU ĐỎ, ĐƯỜNG KẸT, DO CODE CÓ TRỤC TRẶC TÍNH TOÁN
//MÚN LÀM ĐƯỢC ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ
//Java: NUnit, TestNG
//C#: NUnit, MSTest, xUnit
//PHP: PHPUnit
//...mọi ngôn ngữ đều có thư viện XANH-ĐỎ giúp cảnh báo hàm tốt hay ko