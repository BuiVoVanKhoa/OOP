import java.util.Scanner;
public class Bai86 {
    public static void tim(int x, int a[]){
        System.out.print("Cac phan tu tu 1 toi x: \n");
        for (int i=0; i<a.length; i++){
            if (a[i]>=1 && a[i]<=x)
                System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        tim(x, a);
    }
}