package buoi_3;

import java.util.Scanner;

public class bai_3 {
    // Nhập vào số n. Dùng for để in bảng cửu chương của n.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập số thứ bất kỳ: ");
        int so = scanner.nextInt();

        // In ra bảng cửu chương:
        System.out.print("Bảng cửu chương của: " + so +": \n");
        for (int i = 1; i <= 10; i++){
            System.out.println(so + "x" + i + "=" + (so *i));
        }
        scanner.close();

    }
}
