import java.util.Scanner;
public class Bai28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n, tong=0;
        do{
            n=sc.nextInt();
            if (n<0)
                System.out.print("Nhap lai: ");
        }
        while (n<0);
        for (int i=1; i<n; i++)
            if (n%i==0)
                tong+=i;
        if (tong==n)
            System.out.print("n la so hoan thien\n");
        else
            System.out.print("n khong phai so toan thien\n");
    }
}