package HackerRank;

import java.util.Scanner;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat formatUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatUs.format(payment);

        NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatChina.format(payment);

        NumberFormat formatFranca = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatFranca.format(payment);

        Locale fomarIndia = new Locale("en", "INDIA");
        NumberFormat formatIndia = NumberFormat.getCurrencyInstance(fomarIndia);
        String india = formatIndia.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
