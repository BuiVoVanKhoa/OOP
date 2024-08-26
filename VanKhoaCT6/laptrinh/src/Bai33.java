import java.util.Scanner;
public class Bai33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        int tich=1;
        for (int i=1; i<=n; i++){
            tich*=(2*i+1);
        }
        System.out.print("Ket qua: "+tich+"\n");
    }
}