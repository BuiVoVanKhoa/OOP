import java.util.Scanner;
public class Bai73 {
    public static int vitrix(int x, int a[]){
        int vitrix=0;
        for (int i=a.length-1; i>=0; i--)
            if (a[i]==x){
                vitrix=i;
                break;
            }
        return vitrix;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Nhap phan tu can tim: ");
        int x=sc.nextInt();
        if (a[vitrix(x,a)]==x){
            System.out.print("Phan tu can tim:");
            System.out.print("\na["+vitrix(x,a)+"]: "+x+"\n");
        }
        else
            System.out.print("Khong tim thay phan tu");
    }
}