package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidade.TaxPayer;
import entidade.Individual;
import entidade.Company;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();
        System.out.print("Informe o número de contribuintes: ");
        int n = sc.nextInt(); // Lê o número de contribuintes

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("Pessoa física ou pessoa jurídica (f/j)? ");
            char x = sc.next().charAt(0); // Lê o tipo de contribuinte (pessoa física ou jurídica)
            sc.nextLine(); // Consumir a quebra de linha

            System.out.print("Nome: ");
            String nome = sc.nextLine(); // Lê o nome do contribuinte
            System.out.print("Renda anual: ");
            double anualIncome = sc.nextDouble(); // Lê a renda anual do contribuinte

            if (x == 'f') { // Se for pessoa física
                System.out.print("Gastos com saúde: ");
                double healthExpenditures = sc.nextDouble(); // Lê os gastos com saúde
                taxPayers.add(new Individual(nome, anualIncome, healthExpenditures)); // Adiciona um novo contribuinte do tipo pessoa física à lista
            } else { // Se for pessoa jurídica
                System.out.print("Número de funcionários: ");
                int numberOfEmployees = sc.nextInt(); // Lê o número de funcionários
                taxPayers.add(new Company(nome, anualIncome, numberOfEmployees)); // Adiciona um novo contribuinte do tipo pessoa jurídica à lista
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double totalTaxes = 0; // Inicializa a variável para o total de impostos pagos

        // Itera sobre a lista de contribuintes
        for (TaxPayer taxPayer : taxPayers) {
            double tax = taxPayer.tax(); // Calcula o imposto a ser pago pelo contribuinte
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax)); // Exibe o nome do contribuinte e o valor do imposto pago
            totalTaxes += tax; // Adiciona o valor do imposto ao total de impostos pagos
        }

        System.out.println("\nTOTAL DE IMPOSTOS: $ " + String.format("%.2f", totalTaxes)); // Exibe o total de impostos pagos

        sc.close(); // Fecha o Scanner
    }
}