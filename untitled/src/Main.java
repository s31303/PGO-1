// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();

        if (number>0){
            System.out.println(" liczba jest dobra");
        }else if (number==0){
            System.out.println(" Wartość jest równa 0");
        }else {
            System.out.println(" liczba jest zła");
        }
    }
}
