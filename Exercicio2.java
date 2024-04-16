/**Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" 
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve 
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente" */

import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Exercicio2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> pergunta = new ArrayList<>();

            pergunta.add("Telefonou para a vítima?");
            pergunta.add("Esteve no local do crime?");
            pergunta.add("Mora perto da vítima?");
            pergunta.add("Devia para a vítima?");
            pergunta.add("Já trabalhou com a vítima?");

            int respostasOK = 0;
            
            for(String perguntas : pergunta) {
                System.out.println(perguntas +  "(S/N):");
                String resposta = scanner.nextLine().toLowerCase();
                if (resposta.equals("s")) {
                    respostasOK++;                 
                }
            }
            if (respostasOK ==2) {
                System.out.println("Pessoa é suspeita.");
            } else if (respostasOK >= 3 && respostasOK <=4) {
                System.out.println("Pessoa é cúmplice");
            } else if (respostasOK == 5) {
                System.out.println("Pessoa é Assassino");                
            } else {
                System.out.println("Pessoa é inocente");
            }
        scanner.close();
    
    }    
}
