import java.util.Scanner;
public class Bai117 {
    public static void chen(int a[], Scanner sc){
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length/2; i++)
            System.out.print(a[i]+" ");
        int spt=a.length/2;
        for (int i=0; i<spt; i++)
            if (a[i]%2==0) {
                for (int j=spt; j>=i+2; j--)
                    a[j]=a[j-1];
                a[i+1]=x;
                i++;
                spt++;
            }
        if (spt==a.length/2){
            for (int j=spt; j>0; j--)
                a[j]=a[j-1];
            a[0]=x;
            spt++;
        }
        System.out.print("\nMang moi: ");
        for (int i=0; i<spt; i++)
            System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[2*n];
        for (int i=0; i<a.length/2; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        chen(a, sc);
    }
}