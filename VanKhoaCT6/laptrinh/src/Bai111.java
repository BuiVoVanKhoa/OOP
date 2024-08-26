import java.util.Scanner;
public class Bai111 {
    public static void xoa(int a[]){
        int max=a[0], dem=0;
        System.out.print("Mang goc: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        for (int i=0; i<a.length; i++)
            if (a[i]>max){
                max=a[i];
                dem=i;
            }
        for (int i=dem; i<a.length-1; i++)
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
        xoa(a);
    }
}