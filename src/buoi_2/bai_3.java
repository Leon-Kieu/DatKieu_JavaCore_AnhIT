package buoi_2;

import java.util.Scanner;

public class bai_3 {
    // Nhập vào điểm số (0–100). Nếu điểm ≥ 50 thì in “Qua môn”, ngược lại in “Trượt”.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Nhập số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập điểm của bạn (0-100):  ");
        int diem = scanner.nextInt();

        // Kiểm tra hợp lệ và in kết quả ra màn hình:
        if ( diem < 0 || diem > 100) {
            System.out.print("Điểm khong hợp lệ");
        } else if (diem >= 50) {
            System.out.print("Qua môn");
        }else {
            System.out.print("Rớt môn");
        }
    }
}
