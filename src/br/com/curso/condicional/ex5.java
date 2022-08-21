/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/
package br.com.curso.condicional;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int code, amout;
        double total = 0.00;
        Scanner input = new Scanner(System.in);
        System.out.println("escreva codigo e quantidade");
        code = input.nextInt();
        amout= input.nextInt();
        input.close();
        if (code == 1){
            total = amout * 4.00;
        } else if (code == 2) {
            total = amout * 4.50;
        } else if (code == 3) {
            total = amout * 5.00;
        } else if (code == 4) {
            total = amout * 2.00;
        } else if (code == 5) {
            total = amout * 1.50;
        }
        System.out.printf("total: R$%.2f", total);
    }

}
