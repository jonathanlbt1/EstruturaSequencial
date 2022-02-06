package EntradaDeDados;

import java.util.Scanner;

public class TipoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char x = sc.next().charAt(0);

        System.out.println("Vc digitou a letra " + x);
        sc.close();
    }
}
