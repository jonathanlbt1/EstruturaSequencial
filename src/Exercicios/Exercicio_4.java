package Exercicios;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
// o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o
// número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, horasTrabalhadas;
        double salarioHora;

        System.out.println("Informe seu numero: ");
        number = sc.nextInt();
        System.out.println("Quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Salario por hora: ");
        salarioHora = sc.nextDouble();

        double wage = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", wage);
        sc.close();
    }
}
