import java.util.Scanner;
public class Bai113 {
    public static void xoa(int a[], Scanner sc){
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        int min=Math.abs(a[0]-x),
                vt=0;
        for (int i=1; i<a.length; i++)
            if (Math.abs(a[i]-x)<min){
                min=Math.abs(a[i]-x);
                vt=i;
            }
        for (int i=vt; i<a.length-1; i++)
            a[i]=a[i+1];
        a[a.length-1]=0;
        System.out.print("\nMang moi: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        xoa(a, sc);
    }
}