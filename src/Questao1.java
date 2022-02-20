import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Questão 1
* Desafio de Programação Capgemini
* Data:19/02/2022
* Por:Jherssica Amorim Carvalho dos Santos

*Descrição da Questão:
*Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
*A base e altura da escada devem ser iguais ao valor de n.
*A última linha não deve conter nenhum espaço.

 */

public class Questao1 {

    public static void main(String[] args) {

        //para ler a entrada de dados
        Scanner entrada = new Scanner(System.in);
        List<String> degraus = new ArrayList<>();


        System.out.print("Digite um Numero: ");
        int qtdDegraus = entrada.nextInt();


        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }


        for (String d : degraus) {
            System.out.println(d);
        }


        entrada.close();
    }

}



