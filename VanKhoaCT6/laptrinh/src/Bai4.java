import java.util.Scanner;
public class Bai4 {
public static void main(String[] args) {
    System.out.print("Nhap a: ");
    Scanner inp = new Scanner(System.in);
    int a=inp.nextInt();
    System.out.print("Nhap b: ");
    int b=inp.nextInt();
    System.out.print("Phan nguyen a chia b: "+a/b);
    System.out.print("\nPhan du a chia b: "+a%b);
}}