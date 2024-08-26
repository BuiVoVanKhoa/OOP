import java.util.Scanner;
public class Bai25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n=sc.nextInt(),
                souoc=0;
        for (int i=1; i<=n; i++)
            if (n%i==0)
                souoc+=1;
        System.out.print("So uoc cua n: "+souoc);
    }
}