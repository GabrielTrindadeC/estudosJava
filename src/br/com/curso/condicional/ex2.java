/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
package br.com.curso.condicional;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
       int number;
        Scanner input = new Scanner(System.in);
        System.out.println("digite o numero");
        number = input.nextInt();
        input.close();
        if(number % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
    }
}
