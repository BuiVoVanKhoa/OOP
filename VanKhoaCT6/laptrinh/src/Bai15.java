import java.util.Scanner;
 class Bai15 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Phuong trinh ax + b = 0");
         System.out.print("\nNhap a: ");
         float a = sc.nextFloat();
         System.out.print("Nhap b: ");
         float b = sc.nextFloat();
         if (a==0) {
             if (b==0)
                 System.out.print("Phuong trinh co vo so no");
             else
                 System.out.print("Phuong trinh vo no");
         }
         else
             System.out.print("Phuong trinh co 1 no: x=" +
                     -b/a);
     }
}
