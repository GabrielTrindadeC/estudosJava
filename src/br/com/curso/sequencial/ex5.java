package br.com.curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int code1, code2, qt1, qt2;
        double price1, price2, total;
        System.out.println("insira codigo, quantidad12e e preço unitario");
        code1 = scanner.nextInt();
        qt1 = scanner.nextInt();
        price1= scanner.nextDouble();
        System.out.println("insira codigo, quantidade e preço unitario");
        code2 = scanner.nextInt();
        qt2 = scanner.nextInt();
        price2= scanner.nextDouble();
        scanner.close();
        total = qt1 * price1 + qt2 * price2;
        System.out.printf("TOTAL A PAGAR: R$%.2f", total);
    }
}
