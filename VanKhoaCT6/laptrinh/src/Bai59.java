import java.util.Scanner;
public class Bai59 {
    static int uoc(int n, int i){
        int uoc=0;
        if (n%i==0)
            uoc=i;
        return uoc;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt(), uocle=1;
        for (int i=3; i<=n; i+=2)
            if (uoc(n, i)>uocle)
                uocle=uoc(n, i);
        System.out.println("Uoc so le lon nhat cua n: "+uocle);
    }
}