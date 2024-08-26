import java.util.Scanner;
public class Bai39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        double tong=0;
        for (int i=1; i<=n; i++){
            double giaithua=1;
            for (int j=1; j<=i; j++)
                giaithua*=j;
            tong+=1.d/giaithua;
        }
        System.out.print("Ket qua: "+tong+"\n");
    }
}
