package buoi_1;

public class bai_3 {
    //Viết chương trình khai báo hai biến width (chiều rộng)
    // và height (chiều dài), sau đó tính và in ra diện tích, chu vi của hình chữ nhật.
    public static void main (String[] args) {
        // Khai báo biến
        double chieuCao = 4.9;
        double chieuDai = 5.7;

        // Tính diện tich và chu vi
        double dienTich = chieuCao * chieuDai;
        double chuVi = (chieuDai + chieuCao) * 2;

        // In ra kết quả:
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Chu vi: " + chuVi);
    }
}
