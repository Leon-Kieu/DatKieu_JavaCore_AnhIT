package buoi_3;

import java.util.Scanner;

public class bai_2 {
    // Nhập vào số nguyên n. Dùng for để tính n! (giai thừa của n).
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();

        long factorial = 1;
        // Tính giai thừa bằng for
        for (int i = 1; i <= so1; i++){
            factorial *= i;
        }

        // In ra kết quả"
        System.out.println(so1 + "! = "+ factorial);
        scanner.close();
    }
}
