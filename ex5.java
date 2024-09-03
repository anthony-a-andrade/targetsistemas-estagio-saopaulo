/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
*/

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto... ");
        String texto = scanner.nextLine();

        String inverso = "";
        for (char chr : texto.toCharArray()) {
            inverso = chr + inverso;
        }

        System.out.println("Texto invertido: " + inverso);

        scanner.close();
    }
    
}
