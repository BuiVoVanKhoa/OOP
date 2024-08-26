import java.util.Scanner;
public class Bai35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n>=0: ");
        int n=sc.nextInt();
        while (n<0){
            System.out.print("Nhap lai: ");
            n=sc.nextInt();
        }
        int tong=0;
        for (int i=1; i<=n; i++)
            tong+=Math.pow(i, i);
        System.out.print("Ket qua: "+tong+"\n");
    }
}