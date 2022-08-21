/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não*/
package br.com.curso.condicional;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("qual a numero?");
        number = input.nextInt();
        input.close();
        if (number < 0) {
            System.out.println("numero negativo");
        } else {
            System.out.println("numero positivo");
        }
    }
}