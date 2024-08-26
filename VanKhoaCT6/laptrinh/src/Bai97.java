import java.util.Scanner;

public class Bai97 {
    public static void tong(int a[]){
        int tong=0;
        for (int i=0; i<a.length; i+=2)
                tong+=a[i];
        System.out.print("Tong cac phan tu tai vi tri chan: "+tong);
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