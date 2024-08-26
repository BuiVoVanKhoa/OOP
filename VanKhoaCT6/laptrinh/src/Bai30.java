import java.util.Scanner;
public class Bai30 {
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
        int tong=0;
        for (int i=0; i<=n; i++){
            tong+=2*i+1;
        }
        System.out.print("Tong n+1 so le dau tien: "+tong+"\n");
    }
}
