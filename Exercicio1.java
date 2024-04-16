/**
 * Faça um programa que receba a temperatura média de cada mês do ano e 
armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e 
mostre todas as temperaturas acima da média anual, e em que mês elas 
ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
 */

 import java.util.ArrayList;
 import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaMeses = new ArrayList<String>();
        ArrayList<Double> temperaturas = new ArrayList<>();

        listaMeses.add("Janeiro");
        listaMeses.add("Fevereiro");
        listaMeses.add("Março");
        listaMeses.add("Abril");
        listaMeses.add("Maio");
        listaMeses.add("Junho");
        listaMeses.add("Julho");
        listaMeses.add("Agosto");
        listaMeses.add("Setembro");
        listaMeses.add("Outubro");
        listaMeses.add("Novembro");
        listaMeses.add("Dezembro");



        for (String mes : listaMeses) {
            System.out.print("Digite a temperatura média do mês " + mes +":");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
        
        }

        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        double mediaAnual = soma/temperaturas.size();
        System.out.printf("A média anual é: %.2f%n", mediaAnual);

        System.out.println("Temperaturas acima da média anual:");
        for(int i=0; i<listaMeses.size();i++){
            if (temperaturas.get(i) > mediaAnual) {
                System.out.println(listaMeses.get(i)+ ": "+temperaturas.get(i)+ "ºC");
            }

        }

        scanner.close();
    }
}