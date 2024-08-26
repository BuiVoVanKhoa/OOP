import java.util.Scanner;
public class Bai85 {
    public static int max(int a[]){
        int max=a[0], vt=0;
        for (int i=1; i<a.length; i++)
            if (a[i]>max){
                max=a[i];
                vt=i;
            }
        return vt;
    }
    public static int min(int a[]){
        int min=a[0], vt=0;
        for (int i=1; i<a.length; i++)
            if (a[i]<min){
                min=a[i];
                vt=i;
            }
        return vt;
    }
    public static void doicho(int a[]){
        System.out.print("Mang moi: \n");
        for (int i=0; i<a.length; i++){
            if (i==min(a))
                System.out.print("a["+i+"]: "+a[max(a)]+"\n");
            else
                if (i==max(a))
                    System.out.print("a["+i+"]: "+a[min(a)]+"\n");
                else
                    System.out.print("a["+i+"]: "+a[i]+"\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        doicho(a);
    }
}