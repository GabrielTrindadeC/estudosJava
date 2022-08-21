/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente*/
package br.com.curso.condicional;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("digite os valores");
        a = input.nextInt();
        b = input.nextInt();
        if (a % b == 0  || b % a == 0){
            System.out.println("são multiplos");
        }else {
            System.out.println("não são multiplos");
        }
    }
}
