package Bai9va10;

public class PTBN {

    // Thuộc tính
    // Tiền_tố    Kiểudữliệu     Tên_thuộc_tính;
    private double a, b;

    // Constructor
    public PTBN(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Phương thức
    public void giaiPTBN() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem : " + (-this.b / this.a));
        }
    }
}
