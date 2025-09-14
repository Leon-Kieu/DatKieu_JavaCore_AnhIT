package buoi_3;

public class bai_4 {
    // Cho mảng: {1, 2, 3, 4, 5, 6}.
    // Dùng for-each để tính tổng các số chẵn trong mảng.
    public static void main (String[] args){
        // Khai báo mảng so có các giá trị: 1 2 3 4 5 6
        int[] so = {1, 2, 3, 4, 5, 6};

        // Khai báo biến tổng là sum
        int sum = 0;

        // Duyệt mảng:
        for (int num : so){ // khai báo biến num duyệt qua từng phần tử của mảng
            if (num % 2 ==0){ // Nếu là số chẳn thì cộng vào tổng
                sum += num;
            }
        }

        System.out.println(" Tổng các số chẳn trong mảng là: "+ sum);
    }
}
