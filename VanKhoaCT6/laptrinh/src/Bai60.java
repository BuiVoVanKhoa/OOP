import java.util.Scanner;
public class Bai60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        byte chan=0, le=0;
        while (n!=0){
        if (n%10%2==0)
            chan+=1;
        else le+=1;
        n/=10;
        }
        if (chan==0)
            System.out.print("Cac chu so cua n deu la so le\n");
        if (le==0)
            System.out.print("Cac chu so cua n deu la so chan\n");
    }
}