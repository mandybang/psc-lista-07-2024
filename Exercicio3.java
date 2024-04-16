/**Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for 
informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem. */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double valor = 0;

        while (valor != -1) {
            System.out.print("Informe a nota (ou -1 para encerrar): ");
            valor = scanner.nextDouble();
            if (valor != -1) {
                notas.add(valor);
            }
        }

        System.out.println("Quantidade de valores lidos: " + notas.size());
        System.out.print("Valores na ordem em que foram informados: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println("Valores na ordem inversa à que foram informados:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        
        int acimaDaMedia = 0; // Calcular e mostrar a quantidade de valores acima da média
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

        
        int abaixoDeSete = 0; // Calcular e mostrar a quantidade de valores abaixo de sete
        for (double nota : notas) {
            if (nota < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}