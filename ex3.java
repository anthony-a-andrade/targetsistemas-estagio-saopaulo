
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
*/

public class ex3 {
    public static void main(String[] args) throws IOException {
        List<Double> faturamento = new ArrayList<>();
        faturamento.add(22174.1664);
        faturamento.add(24537.6698);
        faturamento.add(26139.6134);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(26742.6612);
        faturamento.add(0.0);
        faturamento.add(42889.2258);
        faturamento.add(46251.174);
        faturamento.add(11191.4722);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(3847.4823);
        faturamento.add(373.7838);
        faturamento.add(2659.7563);
        faturamento.add(48924.2448);
        faturamento.add(18419.2614);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(35240.1826);
        faturamento.add(43829.1667);
        faturamento.add(18235.6852);
        faturamento.add(4355.0662);
        faturamento.add(13327.1025);
        faturamento.add(0.0);
        faturamento.add(0.0);
        faturamento.add(25681.8318);
        faturamento.add(1718.1221);
        faturamento.add(13220.495);
        faturamento.add(8414.61);
            
        List<Double> faturamentoExistente = faturamento.stream().filter((v) -> v > 0).collect(Collectors.toList());
        
        double menor = faturamentoExistente.stream().min((a, b) -> a.compareTo(b)).get();
        double maior = faturamentoExistente.stream().max((a, b) -> a.compareTo(b)).get();
        double media = faturamentoExistente.stream().reduce(0D, Double::sum) / faturamentoExistente.size();
        long diasSuperioresMedia = faturamentoExistente.stream().filter((valor) -> valor > media).count();

        System.out.println(String.format("Menor faturamento: R$ %.2f", menor));
        System.out.println(String.format("Maior faturamento: R$ %.2f", maior));
        System.out.println(String.format("Média de faturamento: R$ %.2f", media));
        System.out.println(String.format("Número de dias que faturamento foi superior à média: %d", diasSuperioresMedia));
    }
}
