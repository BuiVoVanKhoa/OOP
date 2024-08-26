import java.util.Scanner;
public class Bai80 {
    public static int duong(int a[]){
        int duong=-1;
        for (int i=0; i<a.length; i++)
            if (a[i]>0){
                duong=i;
                break;
            }
        System.out.print(duong);
        return duong;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu duong: ");
        duong(a);
        System.out.print("\n");
    }
}