import java.util.Scanner;
public class Bai78 {
    public static int am(int a[]){
        int am=-1;
        for (int i=0; i<a.length; i++)
            if (a[i]<0){
                am=i;
                break;
            }
        System.out.print(am+" ");
        return am;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu am: ");
        am(a);
        System.out.print("\n");
    }
}