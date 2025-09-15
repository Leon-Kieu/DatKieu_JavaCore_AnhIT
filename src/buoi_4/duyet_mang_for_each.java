package buoi_4;

public class duyet_mang_for_each {


    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 25, 40, 50};
        System.out.println("Duyệt mảng bằng for-each");

        for (int num : numbers){
            System.out.println("Gía trị từng phần tử của mảng là: "+num);
        }
    }



}
