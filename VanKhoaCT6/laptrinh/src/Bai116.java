import java.util.Scanner;
public class Bai116 {
    public static boolean nguyento(int i){
        boolean nguyento=true;
        if (i<=1)
            nguyento=false;
        for (int j=2; j<=i-1; j++){
            if (i%j==0){
                nguyento=false;
                break;
            }
        }
        return nguyento;
    }
    public static void chen(int a[], Scanner sc){
        System.out.print("Nhap x: ");
        int x=sc.nextInt();
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length-1; i++)
            System.out.print(a[i]+" ");
        int vt=0;
        for (int i=1; i<a.length; i++)
            if (nguyento(a[i])){
                vt=i;
                break;
            }
        for (int i=a.length-1; i>vt; i--)
            a[i]=a[i-1];
        a[vt]=x;
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