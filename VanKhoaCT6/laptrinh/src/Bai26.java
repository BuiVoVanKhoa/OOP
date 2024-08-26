import java.util.Scanner;
public class Bai26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt();
        boolean nguyento=true;
        for (int i=2; i<=n/2; i++)
            if (n%i==0) {
                nguyento=false;
                break;
            }
        if (n>=2 && nguyento==true)
            System.out.print("n la so nguyen to\n");
        else
            System.out.print("n khong phai so nguyen to\n");
    }
}