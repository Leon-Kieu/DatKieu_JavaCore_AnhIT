package buoi_1;

import java.util.Scanner;

public class bai_4 {
    // Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số chẵn hay lẻ.
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
         // Nhập số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập 1 số nguyên dương: ");
        int number = scanner.nextInt();

        // Kiểm tra chẵn hay lẻ
        if (number % 2 == 0){
            System.out.print(" Là sô chẵn");
        }else {
            System.out.print(" Là sô lẻ");
        }
    }
}
