import java.util.Scanner;

public class Bai89 {
    public static void dem(int x, int a[]){
    int dem=0;
    for (int i=0; i<a.length; i++)
        if (a[i]==x)
            dem+=1;
    System.out.print("So lan x xuat hien: "+dem);
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
        dem(x, a);
    }
}
