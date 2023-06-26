/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appcalculadora;

/**
 *
 * @author nelso
 */
import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar cadastro com o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo(a) à calculadora.");

        boolean continuar = true;

        while (continuar) {
            // Exibir as opções de operação
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Radiciação");

            System.out.print("Digite o número da operação desejada: ");
            int operacao = scanner.nextInt();

            // Variáveis para armazenar os números
            double num1, num2;

            // Verificar se a operação é de radiciação
            if (operacao == 5) {
                System.out.print("Digite o número: ");
                num1 = scanner.nextDouble();
                num2 = 0; // Definir o segundo número como zero
            } else {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
            }

            // Criar objeto da classe Cálculos
            Calculos calculadora = new Calculos();

            // Realizar a operação selecionada e exibir o resultado
            double resultado = 0;

            switch (operacao) {
                case 1:
                    resultado = calculadora.somar(num1, num2);
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case 2:
                    resultado = calculadora.subtrair(num1, num2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = calculadora.multiplicar(num1, num2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    resultado = calculadora.dividir(num1, num2);
                    System.out.println("Resultado da divisão: " + resultado);
                    break;
                case 5:
                    resultado = calculadora.raizQuadrada(num1);
                    System.out.println("Raiz quadrada: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            // Perguntar se o usuário deseja continuar ou sair
            System.out.print("Deseja continuar? (S/N): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
    }
}

class Calculos {
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }
}
