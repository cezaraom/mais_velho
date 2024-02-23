package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da 1a pessoa: ");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();

        }

        int maioridade = idade[0];
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicaoMaior]);

        sc.close();
    }
}