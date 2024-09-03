
import java.util.Map;

/*
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
*/

public class ex4 {
    public static void main(String[] args) {
        Map<String, Double> faturamentos = Map.of(
            "SP", 67836.43,
            "RJ", 36678.66,
            "MG", 29229.88,
            "ES", 27165.48,
            "Outros", 19849.53
        );

        double total = faturamentos.values().stream().reduce(0D, Double::sum);
        System.out.println(String.format("Faturamento Total: R$ %.2f\n", total));

        faturamentos.keySet().forEach((estado) -> {
            double faturamento = faturamentos.get(estado);
            double porcentagem = (faturamento * 100) / total;
            System.out.println(String.format("%s - %.2f%%", estado, porcentagem));
        });
    }
}
