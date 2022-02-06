package EntradaDeDados;

import java.util.Scanner;

public class TipoDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero com ponto flutuante: ");
        double x = sc.nextDouble();

        System.out.println("Vc digitou o numero " + x);
    }
}
