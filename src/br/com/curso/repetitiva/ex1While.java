/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002*/
package br.com.curso.repetitiva;

import java.util.Scanner;

public class ex1While {
    public static void main(String[] args) {
        int pwd;
        Scanner input = new Scanner(System.in);
        pwd = input.nextInt();
        while (pwd != 2002) {
            System.out.println("Senha invalida");
            pwd = input.nextInt();
        }
        System.out.println("Senha Valida");
        input.close();
    }
}
