import java.util.Scanner;
public class Bai54 {
    static double giaithua(byte i){
        double giaithua=1;
            for (int j=1; j<=i; j++)
                giaithua*=j;
        return giaithua;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        double tong=0;
        for (byte i=1; i<=n; i++)
            tong+=1/giaithua(i);
        System.out.print("Ket qua: "+tong+"\n");
    }
}