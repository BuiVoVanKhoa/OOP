import java.util.Scanner;
public class Bai105 {
    public static void tong(int x, int a[]){
        int tong=0, dem=0;
        for (int i=0; i<a.length; i++)
            if (x%a[i]==0){
                tong+=a[i];
                dem+=1;
            }
        System.out.print("Trung binh phan tu uoc x: "+1.f*tong/dem);
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
        tong(x, a);
    }
}