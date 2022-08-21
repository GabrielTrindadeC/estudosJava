package br.com.curso.sequencial;

import java.util.Scanner;

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, diference;
        System.out.println("Digite os valores (na ordem) de a,b,c e d");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        diference = a * b - c * d;
        System.out.println("A diferença é: " + diference);
    }
}
