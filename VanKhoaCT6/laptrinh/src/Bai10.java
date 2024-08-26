import java.util.Scanner;
public class Bai10{
public static void main(String[] args){
    System.out.print("\033[H\033[2J");
    System.out.print("Nhap a: ");
    Scanner inp = new Scanner(System.in);
    int a=inp.nextInt();
    System.out.print("Nhap b: ");
    int b=inp.nextInt();
    System.out.print("Nhap c: ");
    int c=inp.nextInt();
    System.out.print("Nhap d: ");
    int d=inp.nextInt();
    System.out.print("Trung binh cong a, b, c, d: "+(a+b+c+d)/4.f);
}}