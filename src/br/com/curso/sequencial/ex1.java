package br.com.curso.sequencial;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos*/
        Scanner scanner = new Scanner(System.in);
        int x, y, result;
        System.out.println("insira o valor de x");
        x = scanner.nextInt();
        System.out.println("insira o valor de y");
        y = scanner.nextInt();
        scanner.close();
        result = x + y;
        System.out.println("resultado: " + result);
    }
}
