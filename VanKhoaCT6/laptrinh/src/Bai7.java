import java.util.Scanner;
public class Bai7{
public static void main(String[] args){
    System.out.print("\033[H\033[2J");
    System.out.print("Nhap gio: ");
    Scanner inp = new Scanner(System.in);
    int x=inp.nextInt(),
    giay=x*3600;
    System.out.print("Nhap phut: "); 
    x=inp.nextInt();
    giay=giay+x*60;
    System.out.print("Nhap giay: "); 
    x=inp.nextInt();
    giay=giay+x;
    System.out.print("So giay: " +giay+"\n");
}}