import java.util.Scanner;
public class Bai23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt();
        if (Math.sqrt(n)%1==0)
            System.out.print("n la so chinh phuong");
        else
            System.out.print("n khong phai so chinh phuong");    
    }
}