import java.util.Scanner;
public class Bai36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        while (n<0){
            System.out.print("Nhap lai: ");
            n=sc.nextInt();
        }
        int tong=0, giaithua=1;
        for (int i=1; i<=n; i++){
            giaithua*=i;
            tong+=giaithua;
        }
        System.out.print("Ket qua: "+tong+"\n");
    }
}