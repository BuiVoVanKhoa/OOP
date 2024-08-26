import java.util.Scanner;
public class Bai87 {
    public static void duong(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++)
            if (a[i]>0)
                dem+=1;
        System.out.print("Mang co "+dem+" phan tu duong\n");
    }
    public static void am(int a[]){
        int dem=0;
        for (int i=0; i<a.length; i++)
            if (a[i]<0)
                dem+=1;
        System.out.print("\t\t"+dem+" phan tu am");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        duong(a);
        am(a);
    }
}