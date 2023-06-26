# Calculadora em Java
 Aula prática - Linguagem orientada a objetos

 Repositório criado para desenvolvimento de aulas práticas propostas pela faculdade.

 AppCalculadora:
 
 Construir uma aplicação, uma calculadora para calcular os investimentos feitos na aplicaçãodesenvolvida na atividade anterior mas também, implementar uma operação adicional. Aradiciação. Tudo isso, utilizando conceitos de herança.

- Compreender conceitos relacionados a construção de métodos na programação em Java. 
- Aprender a utilizar estruturas de decisão para auxiliar a definição de escolhas na programaçãoem Java. 
- Identificar e aplicar conceitos de orientação a objetos com uso de herança. 
- Entender como invocar métodos em programação orientada a objetos.

AppCalculadora.java
  1 /*
  2  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  3  */
  4 
  5 package com.mycompany.appcalculadora;
  6 
  7 /**
  8  *
  9  * @author nelso
 10  */
 11 import java.util.Scanner;
 12 
 13 public class AppCalculadora {
 14     public static void main(String[] args) {
 15         Scanner scanner = new Scanner(System.in);
 16 
 17         // Solicitar cadastro com o nome do usuário
 18         System.out.print("Digite seu nome: ");
 19         String nome = scanner.nextLine();
 20         System.out.println("Olá, " + nome + "! Bem-vindo(a) à calculadora.");
 21 
 22         boolean continuar = true;
 23 
 24         while (continuar) {
 25             // Exibir as opções de operação
 26             System.out.println("Escolha a operação:");
 27             System.out.println("1. Adição");
 28             System.out.println("2. Subtração");
 29             System.out.println("3. Multiplicação");
 30             System.out.println("4. Divisão");
 31             System.out.println("5. Radiciação");
 32 
 33             System.out.print("Digite o número da operação desejada: ");
 34             int operacao = scanner.nextInt();
 35 
 36             // Variáveis para armazenar os números
 37             double num1, num2;
 38 
 39             // Verificar se a operação é de radiciação
 40             if (operacao == 5) {
 41                 System.out.print("Digite o número: ");
 42                 num1 = scanner.nextDouble();
 43                 num2 = 0; // Definir o segundo número como zero
 44             } else {
 45                 System.out.print("Digite o primeiro número: ");
 46                 num1 = scanner.nextDouble();
 47 
 48                 System.out.print("Digite o segundo número: ");
 49                 num2 = scanner.nextDouble();
 50             }
 51 
 52             // Criar objeto da classe Cálculos
 53             Calculos calculadora = new Calculos();
 54 
 55             // Realizar a operação selecionada e exibir o resultado
 56             double resultado = 0;
 57 
 58             switch (operacao) {
 59                 case 1:
 60                     resultado = calculadora.somar(num1, num2);
 61                     System.out.println("Resultado da adição: " + resultado);
 62                     break;
 63                 case 2:
 64                     resultado = calculadora.subtrair(num1, num2);
 65                     System.out.println("Resultado da subtração: " + resultado);
 66                     break;
 67                 case 3:
 68                     resultado = calculadora.multiplicar(num1, num2);
 69                     System.out.println("Resultado da multiplicação: " + resultado);
 70                     break;
 71                 case 4:
 72                     resultado = calculadora.dividir(num1, num2);
 73                     System.out.println("Resultado da divisão: " + resultado);
 74                     break;
 75                 case 5:
 76                     resultado = calculadora.raizQuadrada(num1);
 77                     System.out.println("Raiz quadrada: " + resultado);
 78                     break;
 79                 default:
 80                     System.out.println("Opção inválida.");
 81             }
 82 
 83             // Perguntar se o usuário deseja continuar ou sair
 84             System.out.print("Deseja continuar? (S/N): ");
 85             String resposta = scanner.next();
 86 
 87             if (!resposta.equalsIgnoreCase("S")) {
 88                 continuar = false;
 89             }
 90         }
 91     }
 92 }
 93 
 94 class Calculos {
 95     public double somar(double a, double b) {
 96         return a + b;
 97     }
 98 
 99     public double subtrair(double a, double b) {
100         return a - b;
101     }
102 
103     public double multiplicar(double a, double b) {
104         return a * b;
105     }
106 
107     public double dividir(double a, double b) {
108         return a / b;
109     }
110 
111     public double raizQuadrada(double a) {
112         return Math.sqrt(a);
113     }
114 }
115 