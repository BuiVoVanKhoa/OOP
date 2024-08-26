import java.util.Scanner;
public class Bai27 {
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a: ");
        int a=nhap();
        System.out.print("Nhap so nguyen duong b: ");
        int b=nhap();
        for (int i=a; i>=1; i--)
            if (a%i==0 && b%i==0){
                System.out.print("Uoc chung lon nhat: "+i+"\n");
                break;
            }
        for (int i=a; true; i++)
            if (i%a==0 && i%b==0){
                System.out.print("Boi chung nho nhat: "+i+"\n");
                break;
            }
    }
    public static int nhap(){
        Scanner sc=new Scanner(System.in);
        int x=0;
        do{
            x=sc.nextInt();
            if (x<=0)
                System.out.print("Nhap lai: ");
        }
        while (x<=0);
        return x;
    }
}