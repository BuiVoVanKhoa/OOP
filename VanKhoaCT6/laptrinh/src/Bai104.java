import java.util.Scanner;
public class Bai104 {
    public static void tong(int a[]){
        int tong=0, dem=0;
        for (int i=0; i<a.length; i++)
            if (a[i]%2!=0){
                tong += a[i];
                dem += 1;
            }
        System.out.print("Trung binh cac phan tu le: "+(float)tong/dem);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        tong(a);
    }
}