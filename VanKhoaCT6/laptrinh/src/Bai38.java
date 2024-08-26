import java.util.Scanner;
public class Bai38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        while (n<=0){
            System.out.print("Nhap lai: ");
            n=sc.nextInt();
        }
        double tong=0;
        for (int i=1; i<=n; i++){
            tong+=(double)i/(i+1);
        }
        System.out.print("Ket qua: "+tong+"\n");
    }
}
