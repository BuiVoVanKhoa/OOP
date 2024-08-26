import java.util.Scanner;
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt();
        System.out.print("Cac uoc so: ");
        for (int i=1; i<=n; i++)
            if (n%i==0)
                System.out.print(i+" ");
    }
}