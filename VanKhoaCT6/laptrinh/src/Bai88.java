import java.util.Scanner;

public class Bai88 {
    public static void chan(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++)
            if (a[i]%2==0)
                dem+=1;
        System.out.print("Mang co "+dem+" phan tu chan\n");
    }
    public static void le(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++)
            if (a[i]%2!=0)
                dem+=1;
        System.out.print("\t\t"+dem+" phan tu le");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        chan(a);
        le(a);
    }
}