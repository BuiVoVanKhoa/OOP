import java.util.Scanner;
public class Bai106 {
    public static void giamdan(int a[]){
        int doi;
        for (int i=0; i<a.length; i++)
            for (int j=i+1; j<a.length; j++)
                if (a[j]>a[i]){
                    doi=a[i];
                    a[i]=a[j];
                    a[j]=doi;
                }
        System.out.print("Giam dan: \n");
        for (int i=0; i<a.length; i++)
            System.out.print("a["+i+"]: "+a[i]+"\n");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        giamdan(a);
    }
}