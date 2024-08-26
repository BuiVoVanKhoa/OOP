import java.util.Scanner;
public class Bai81 {
    public static int minduong(int a[]){
        int duong=-1;
        for (int i=0; i<a.length; i++)
            if (a[i]>0){
                duong=i;
                break;
            }
        int minduong=0;
        if (duong!=-1){
            minduong=a[duong];
            for (int i=duong; i<a.length; i++)
                if (a[i]>0 && a[i]<minduong)
                    minduong=a[i];
            for (int i=duong; i<a.length; i++)
                if (a[i]==minduong)
                    System.out.print(i+" ");
        }
        if (duong==-1)
            System.out.print("Khong co");
        return minduong;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so phan tu mang a: ");
        int n=sc.nextInt(), a[]=new int[n];
        for (int i=0; i<a.length; i++){
            System.out.print("a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Vi tri phan tu duong be nhat: ");
        minduong(a);
        System.out.print("\n");
    }
}