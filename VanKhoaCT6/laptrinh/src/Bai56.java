import java.util.Scanner;
public class Bai56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        byte chan=0, le=0;
        while (n!=0){
        if (n%10%2==0)
            chan+=1;
        else
            le+=1;
        n/=10;
        }
        System.out.print("n co "+chan+" chu so chan");
        System.out.print("\n     "+le+" chu so le");
    }
}
