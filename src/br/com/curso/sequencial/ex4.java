package br.com.curso.sequencial;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.*/
public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int employeeNumber, hoursWorked;
        double valuePerHour, salary;
        System.out.println("Digite (na ordem) numero do funcionario, horas trabalhadas, e o valor/hora");
        employeeNumber = scanner.nextInt();
        hoursWorked = scanner.nextInt();
        valuePerHour = scanner.nextDouble();
        salary = valuePerHour * hoursWorked;
        System.out.printf("Number = %d%nSalary = U$ %.2f ", employeeNumber, salary);
        scanner.close();
    }
}
