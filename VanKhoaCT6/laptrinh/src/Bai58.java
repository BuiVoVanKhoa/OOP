import java.util.Scanner;
public class Bai58 {
    static int uoc(int n, int i){
        int uoc=0;
        if (n%i==0)
            uoc=i;
        return uoc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        long tong=0;
        for (int i=3; i<=n; i+=2)
                tong+=uoc(n, i);
        System.out.println("Tong cac uoc so cua n: "+tong);
    }
}