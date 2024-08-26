import java.util.Scanner;
public class Bai100 {
    public static void tong(int a[]){
        int tong=0;
        for (int i=1; i<a.length-1; i++)
            if (a[i]<a[i-1] && a[i]<a[i+1])
                tong+=a[i];
        if (a[0]<a[1])
            tong+=a[0];
        if (a[a.length-1]<a[a.length-2])
            tong+=a[a.length-1];
        System.out.print("Tong cac phan tu cuc tieu: "+tong);
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