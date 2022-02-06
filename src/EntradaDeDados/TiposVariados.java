package EntradaDeDados;

import java.util.Scanner;

public class TiposVariados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        char w;
        int y;
        double z;

        x = sc.next();
        w = sc.next().charAt(0);
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Vc digitou os valores: ");
        System.out.println(x);
        System.out.println(w);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
