package br.com.curso.sequencial;/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double radius, pi, area;
        pi = 3.14159;
        System.out.println("Insira o valor do Raio");
        radius = scanner.nextDouble();
        scanner.close();
        area = Math.pow(radius, 2.0) * pi;
        System.out.printf("a area do circulo: %.4f ", area);
    }
}
