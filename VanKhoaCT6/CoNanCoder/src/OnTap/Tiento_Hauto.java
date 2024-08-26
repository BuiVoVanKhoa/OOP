package OnTap;

import java.util.*;

public class Tiento_Hauto {

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Nhap so nguyen a : ");
        int a = so.nextInt();
        ++a;
        System.out.println(+a);
        System.out.println("Nhap so nguyen b : ");
        int b = so.nextInt();
        b--;
        System.out.println(+b);
        if (a > b) {
            --a;
            ++b;
        } else if (a == b) {
            ++a;
            b++;
        } else if (b > a) {
            a++;
            b++;
        }
        double tong = a + b;
        System.out.println("Tong hai so nguyen : " + tong);
    }
}
