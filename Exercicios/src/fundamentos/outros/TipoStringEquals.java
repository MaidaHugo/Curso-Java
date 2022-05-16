package fundamentos.outros;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();
        System.out.println("2" == s2.trim()); // Trim tira os espaços em branco de uma string
        System.out.println("2".equals(s2.trim()));

        sc.close();
    }
}
