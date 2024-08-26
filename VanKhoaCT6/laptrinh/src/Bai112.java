import java.util.Scanner;
public class Bai112 {
    public static void xoa(int a[], Scanner sc){
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        int spt=0;
        for(int i=a.length-1; i>=0; i--)
            if (a[i]>=x){
                spt=i+1;
                break;
            }
        for (int i=0; i<spt; i++)
            while (a[i]<x && spt>=1){
                for (int j=i; j<spt-1; j++){
                    a[j]=a[j+1];}
                spt--;
            }
        for (int i=spt; i<a.length; i++)
            a[i]=0;
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