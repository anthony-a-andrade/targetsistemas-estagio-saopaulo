/*
1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
Imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?
*/

public class ex1 {
    public static void main(String[] args) {
        int indice = 13, soma = 0, k = 0;
        while (k < indice) {
            k++;
            soma += k;
        }
        System.out.println("SOMA = " + soma);
    }
}
