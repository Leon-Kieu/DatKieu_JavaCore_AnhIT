package buoi_2;

import java.util.Scanner;

public class bai_4 {
     // Máy tính đơn giản với switch-case
     // Người dùng nhập 2 số và một ký tự toán tử (+, -, *, /).
     //              Dùng switch-case để thực hiện phép tính và in ra kết quả.
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên từ baàn phím:
        System.out.print("Bạn vui lòng nhập số thứ nhất: ");
        double so1 = scanner.nextDouble();

        System.out.print("Bạn vui lòng nhập số thứ nhất: ");
        double so2 = scanner.nextDouble();

        // Nhập toán tử:
        System.out.print("Nhập toán tử: ");
        char  toanTu = scanner.next().charAt(0);

        // Khai bao bien ket qua:
        double ketQua;

        // Dùng switch case để tính toán:
        switch (toanTu){
            case '+':
                ketQua = so1 + so2;
                System.out.print("Kết quả: " + ketQua);
                break;
            case '-':
                ketQua = so1 - so2;
                System.out.print("Kết quả: " + ketQua);
                break;
            case '*':
                ketQua = so1 * so2;
                System.out.print("Kết quả: " + ketQua);
                break;
            case '/':
                ketQua = so1 / so2;
                System.out.print("Kết quả: " + ketQua);
                break;
            default:
                System.out.print("Toán tử không hợp le");
        }
    }
}
