import java.util.Scanner;
public class Bai40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        double tong=0,
                cong=0,
                luythua=1;
        for (int i=1; i<=n; i++){
            cong+=i;
            luythua*=i;
            tong+=(double)cong/luythua;
        }
        System.out.print("Ket qua: "+tong+"\n");
    }
}
