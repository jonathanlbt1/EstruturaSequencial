package EntradaDeDados;

import java.util.Scanner;

public class TipoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite um valor inteiro: ");
        x = sc.nextInt();

        System.out.println("Vc digitou " + x);

        sc.close();


    }
}
