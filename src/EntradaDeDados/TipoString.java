package EntradaDeDados;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String x;
        x = sc.next();
        System.out.println("Vc digitou " + x);


        sc.close();
    }
}
