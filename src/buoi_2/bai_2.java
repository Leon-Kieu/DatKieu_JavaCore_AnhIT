package buoi_2;

import java.util.Scanner;

public class bai_2 {
    // Nhập vào tuổi của một người.
    // Nếu ≥ 18 thì in “Đủ điều kiện lái xe”, ngược lại in “Chưa đủ điều kiện”.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Nhập số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập tuổi của bạn:  ");
        int tuoi = scanner.nextInt();

        // Kểm tra điều kiện lái xe:
        if (tuoi >= 18){
            System.out.print("Bạn đủ điều kiện lái xe máy");
        }else {
            System.out.print("Bạn chưa đủ điều kiện");
        }
    }
}
