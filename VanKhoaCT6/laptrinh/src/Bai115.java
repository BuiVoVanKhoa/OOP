import java.util.Scanner;

public class Bai115 {
    public static void chen(int a[], Scanner sc){
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length-1; i++)
            System.out.print(a[i]+" ");
        int max=a[0],
                vt=0;
        for (int i=1; i<a.length; i++)
            if (a[i]>max){
                max=a[i];
                vt=i;
            }
        for (int i=a.length-1; i>vt+1; i--)
            a[i]=a[i-1];
        a[vt+1]=x;
        System.out.print("\nMang moi: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n+1];
        for (int i=0; i<a.length-1; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        chen(a, sc);
    }
}