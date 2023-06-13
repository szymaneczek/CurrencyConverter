import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        double amount;
        double dollar, euro, pound, zloty, hrywna;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dostępne waluty");
        System.out.println("Enter 1: Dollar");
        System.out.println("Enter 2: Euro");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Złoty");
        System.out.println("Enter 5: Hrywna");

        System.out.println("\nProszę wybrać walutę z listy powyżej");
        choice = sc.nextInt();

        System.out.println("Podaj kwotę jaką chcesz wymienić");
        amount = sc.nextFloat();

    }
}
