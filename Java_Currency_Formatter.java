/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Currency_Formatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format                                                                  (payment);
        Locale locale_india = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(locale_india)                                                     .format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA)                                                     .format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE)                                                     .format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
