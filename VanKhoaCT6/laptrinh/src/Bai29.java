import java.util.Scanner;
public class Bai29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n, tong=0;
        do{
            n=sc.nextInt();
            if (n<0)
                System.out.print("Nhap lai: ");
        }
        while (n<0);
        for (int i=1; i<=n; i++)
            tong+=i;
        System.out.print("Tong cac so tu 1 toi n: "+tong+"\n");
    }
}
