import java.util.Scanner;
public class Bai31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n, chan=0, le=0;
        do{
            n=sc.nextInt();
            if (n<=0)
                System.out.print("Nhap lai: ");
        }
        while (n<=0);
        for (int i=1; i<=n; i++){
            if (i%2==0)
                chan+=i;
            else
                le+=i;
        }
        System.out.print("Tong cac so: "+(le-chan)+"\n");
    }
}