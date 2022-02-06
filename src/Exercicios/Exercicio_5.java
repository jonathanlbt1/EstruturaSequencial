package Exercicios;

import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, qtdPecas1, qtdPecas2;
        double valorUnitario1, valorUnitario2;

        System.out.println("Insira o código da peça 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.println("Insira a quantidade de peças: ");
        qtdPecas1 = sc.nextInt();
        System.out.println("Insira o preço unitário: ");
        valorUnitario1 = sc.nextDouble();

        System.out.println("Insira o código da peça 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.println("Insira a quantidade de peças: ");
        qtdPecas2 = sc.nextInt();
        System.out.println("Insira o preço unitário: ");
        valorUnitario2 = sc.nextDouble();

        double total1 = qtdPecas1 * valorUnitario1;
        double total2 = qtdPecas2 * valorUnitario2;
        double valorFinal = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
        sc.close();
    }
}
