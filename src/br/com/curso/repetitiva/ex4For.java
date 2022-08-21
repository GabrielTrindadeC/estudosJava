/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/
package br.com.curso.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex4For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            double a = input.nextDouble();
            double b = input.nextDouble();
            if (b==0) {
                System.out.println("divisão impossivel");
            }else {
                System.out.printf("%.1f%n", a/b);
            }
        }
        input.close();
    }
}
