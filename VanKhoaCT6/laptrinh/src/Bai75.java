import java.util.Scanner;
public class Bai75 {
    public static int vtmin(int a[]){
        int min=a[a.length-1], vtmin=a.length-1;
        for (int i=a.length-2; i>=0; i--)
            if (a[i]<min){
                min=a[i];
                vtmin=i;
            }
        return vtmin;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu nho nhat: "+vtmin(a)+"\n");
    }
}