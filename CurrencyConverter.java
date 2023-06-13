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

        switch (choice) {
            case 1: // dollar conversion
                euro = amount * 0.92;
                System.out.println(amount + "Dollar = " + f.format(euro) + " Euro ");

                pound = amount * 0.80;
                System.out.println(amount + "Dollar = " + f.format(pound) + " Pound ");

                zloty = amount * 4.20;
                System.out.println(amount + "Dollar = " + f.format(zloty) + " Złoty");

                hrywna = amount * 36.90;
                System.out.println(amount + " Dollar = " + f.format(hrywna) + " Hrywien");
                break;

            case 2: // Euro conversion
                dollar = amount * 1.08;
                System.out.println(amount + "Euro = " + f.format(dollar) + " Dollar ");

                pound = amount * 0.87;
                System.out.println(amount + "Euro = " + f.format(pound) + " Pound ");

                zloty = amount * 4.54;
                System.out.println(amount + "Euro = " + f.format(zloty) + " Złoty");

                hrywna = amount * 39.91;
                System.out.println(amount + "Euro = " + f.format(hrywna) + " Hrywien ");
                break;

            case 3: // pound conversion
                dollar = amount * 1.24;
                System.out.println(amount + "Pound = " + f.format(dollar) + " Dollar ");

                euro = amount * 1.15;
                System.out.println(amount + "Pound = " + f.format(euro) + " Euro ");

                zloty = amount * 5.22;
                System.out.println(amount + "Pound = " + f.format(zloty) + " Złoty");

                hrywna = amount * 45.91;
                System.out.println(amount + "Pound = " + f.format(hrywna) + " Hrywien");
                break;

            case 4: // Złoty
                dollar = amount * 0.24;
                System.out.println(amount + "PLN = " + f.format(dollar) + " Dollar ");

                euro = amount * 0.22;
                System.out.println(amount + "PLN = " + f.format(euro) + " Euro ");

                pound = amount * 0.19;
                System.out.println(amount + "PLN = " + f.format(pound) + " Pound ");

                hrywna = amount * 8.79;
                System.out.println(amount + "PLN = " + f.format(hrywna) + " Hrywien ");
                break;

            case 5: // Hrywna
                dollar = amount * 0.027;
                System.out.println(amount + "UAH = " + f.format(dollar) + " Dollar ");

                euro = amount * 0.025;
                System.out.println(amount + "UAH = " + f.format(euro) + " Euro ");

                pound = amount * 0.022;
                System.out.println(amount + "UAH = " + f.format(pound) + " Pound ");

                zloty = amount * 0.11;
                System.out.println(amount + "UAH = " + f.format(zloty) + " Złotych ");
                break;

            default:
                System.out.println("Podałeś niepoprawną walutę !");
        }
    }
}
