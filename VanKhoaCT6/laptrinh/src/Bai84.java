import java.util.Scanner;
public class Bai84 {
    public static int maxle(int a[]){
        int le=-1, maxle=-1;
        for (int i=0; i<a.length; i++)
            if (a[i]%2!=0){
                maxle=a[i];
                le=i;
                break;
            }
        if (le!=-1){
            for (int i=le+1; i<a.length; i++)
                if (a[i]%2!=0 && a[i]>maxle)
                    maxle=a[i];
            for (int i=le+1; i<a.length; i++)
                if (a[i]==maxle)
                    System.out.print("\na["+i+"]: "+maxle);
        }
        else
            System.out.print("Khong ton tai");
        return maxle;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Phan tu le lon nhat:");
        maxle(a);
        System.out.print("\n");
    }
}