import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import  java.util.Scanner;

/*
 *Questão 3
 * Desafio de Programação Capgemini
 * Data:19/02/2022
 * Por:Jherssica Amorim Carvalho dos Santos
 *
 * Descrição da Questão:
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem
 *  ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo
 * que encontre o número de pares de substrings que são anagramas.

 */

public class Questao3 {

    public static void main(String[] args) {
        //para ler a entrada de dados
        Scanner sc = new Scanner(System.in);

        //variaveis
        String   frase;


        //solicita que um usuario possa digitar um string qualquer
        System.out.println("Digite uma frase:");
        frase= sc.nextLine();

        // chamando a função
        anagrama(frase);

    }

    static void anagrama(String string){

        HashMap<String, Integer> mapa= new HashMap<>();

        for (int i = 0; i <= string.length(); i ++){

            for (int j = i;j < string.length(); j++){

                char[] caractere = string.substring(i,j + 1).toCharArray();
                Arrays.sort(caractere);
                String subCaracter= new String(caractere);



                if(mapa.containsKey(subCaracter)){
                    mapa.put(subCaracter,mapa.get(subCaracter)+1);

                }else{
                    mapa.put(subCaracter,1);
                }
            }


        }


    int Pares=0;
    for (String cont: mapa.keySet())   {

        int n = mapa.get(cont);
        Pares += (n *( n-1))/2;
    }
        System.out.println("A Quantidade de  pares que são anagramas são:" + Pares);


    }
}
