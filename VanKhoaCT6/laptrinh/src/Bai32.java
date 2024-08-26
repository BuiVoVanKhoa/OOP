import java.util.Scanner;
public class Bai32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n;
        do{
            n=sc.nextInt();
            if (n<0)
                System.out.print("Nhap lai: ");
        }
        while (n<0);
        int giaithua=1;
        for (int i=2; i<=n; i++)
            giaithua*=i;
        System.out.print("n giai thua : "+giaithua+"\n");
    }
}