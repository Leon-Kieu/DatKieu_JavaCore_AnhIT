package buoi_1;

public class bai_2 {
   // Viết chương trình hoán đổi giá trị của hai biến a và b mà không sử dụng biến trung gian.
   public static void main (String[] args) {
       // Khai báo biến
       int a = 5;
       int b = 15;
       System.out.println("Gía trị a trước khi hoán đổi: " +a);
       System.out.println("Gía trị b trước khi hoán đổi: " +b);

       // Cách 1: Dùng phéo cộng / trừ:
       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("Gía trị a sau khi hoán đổi: " +a);
       System.out.println("Gía trị b sau khi hoán đổi: " +b);
   }
}
