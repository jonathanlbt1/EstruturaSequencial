package Exercicios;

import java.util.Scanner;
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar
// o valor da área deste círculo com quatro casas decimais conforme exemplos.

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, pi, raio;
        pi = 3.14159;

        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f%n", area);
        sc.close();

    }

}
