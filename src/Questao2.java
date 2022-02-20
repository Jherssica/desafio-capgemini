/*
*Questão 2
* Desafio de Programação Capgemini
* Data:19/02/2022
* Por:Jherssica Amorim Carvalho dos Santos
*
* Descrição:
* Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
*A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte.
*O site considera uma senha forte quando ela satisfaz os seguintes critérios:
*Possui no mínimo 6 caracteres.
*Contém no mínimo 1 digito.
*Contém no mínimo 1 letra em minúsculo.
*Contém no mínimo 1 letra em maiúsculo.
*Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
*Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte.
*Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres
* que devem ser adicionados para uma string qualquer ser considerada segura.

 */


import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        //para ler a entrada de dados
        Scanner sc = new Scanner(System.in);

        //variavéis
        boolean Digito = false;
        boolean LetraMauiscula = false;
        boolean LetraMinuscula = false;
        boolean CaracterEspecial = false;
        String senha;

        int passLen = 6, caracter;

        System.out.println("===LOGIN====");
        System.out.println("");
        System.out.println("Digite seu nome ou usuario: ");
        String nome = sc.nextLine();
        // solicitar o usuario que digite a senha seguindo os criterios exigidos
        System.out.println("Digite uma senha Segura:");
        senha = sc.nextLine();


        // verifica os caracteres exigidos e a quantidade minima obrigatória.
        if (senha.length() < passLen) {


            caracter = passLen - senha.length();
            System.out.printf("Falta %d caracteres para sua senha se tornar segura", caracter);


            // se validar todas as criterios para verificação,a senha está validada.
        } else { //verifica se a senha possui os diferentes caracteres exigidos para uma senha segura
            for (char c : senha.toCharArray()) {
                if (c >= '0' && c <= '9') {
                    Digito = true;
                } else if (c >= 'A' && c <= 'Z') {
                    LetraMauiscula = true;
                } else if (c >= 'a' && c <= 'z') {
                    LetraMinuscula = true;
                } else {
                    CaracterEspecial = true;
                }
            }//cas não apareça os caracteres obrigatórios aparecer mensagem:
            if (!Digito) {
                System.out.println("senha deve ter mínimo 1 digito");
            }
            if (!LetraMauiscula) {
                System.out.println("senha deve ter mínimo 1 Letra Maiuscula");
            }
            if (!LetraMinuscula) {
                System.out.println("senha deve ter mínimo 1 Letra Minuscula");
            }
            if (!CaracterEspecial) {
                System.out.println("senha deve ter mínimo 1 Caracter Especial");
            }

            if (Digito && LetraMauiscula && LetraMinuscula && CaracterEspecial) {
                //Possui todos os critérios de validação, aparece a mensagem:
                System.out.println("Senha Cadastrada com Sucesso!");
            }
        }


    }
}