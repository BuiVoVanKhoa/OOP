import java.util.Scanner;
public class Bai34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n;
        do{
            n=sc.nextInt();
            if (n<=0)
                System.out.print("Nhap lai: ");
        }
        while (n<=0);
        int tong=0;
        for (int i=1; i<=n; i++){
            tong+=i*i;
        }
        System.out.print("Ket qua: "+tong+"\n");
    }
}