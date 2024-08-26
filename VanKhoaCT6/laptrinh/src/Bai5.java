import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap so nguyen duong co 2 chu so: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        System.out.println("Tong cac chu so cua so vua nhap: " + (a/10+a%10));
}}