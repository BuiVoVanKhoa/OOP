import java.util.Scanner;
public class Bai79 {
    public static int maxam(int a[]){
        int am=-1;
        for (int i=0; i<a.length; i++)
            if (a[i]<0){
                am=i;
                break;
            }
        int maxam=0;
        if (am!=-1){
            maxam=a[am];
            for (int i=am; i<a.length; i++)
                if (a[i]<0 && a[i]>maxam)
                    maxam=a[i];
            for (int i=am; i<a.length; i++)
                if (a[i]==maxam)
                    System.out.print(i+" ");
        }
        if (am==-1)
            System.out.print("Khong co");
        return maxam;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu am lon nhat: ");
        maxam(a);
        System.out.print("\n");
    }
}