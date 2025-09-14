package buoi_3;

public class bai_1 {
    // Dùng while để in ra các số chẵn trong khoảng 2 → 200
    public static void main (String[] args){
        int i = 4;
        while (i < 200){
            System.out.println(i);
            i += 2; // Tăng mỗi lần lên 2 đơn vị để luôn là số chẳn
        }
    }
}
