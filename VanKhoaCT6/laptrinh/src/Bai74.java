import java.util.Scanner;
public class Bai74 {
    public static int min(int a[]){
        int min=a[a.length-1];
        for (int i=a.length-1; i>=1; i--)
            if (a[i-1]<a[i])
                min=a[i-1];
        return min;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Phan tu nho nhat: "+min(a)+"\n");
    }
}