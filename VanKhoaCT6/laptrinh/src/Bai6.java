import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap nhiet do Fahrenheit: ");
        Scanner inp = new Scanner(System.in);
        float f = inp.nextFloat();
        System.out.println("Nhiet do Celcius: " +5.0/9*(f-32));
}}