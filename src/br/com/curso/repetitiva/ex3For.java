/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/
package br.com.curso.repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex3For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0; i<n; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        input.close();
    }
}
