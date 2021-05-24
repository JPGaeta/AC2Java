package caixa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean rep = true;
        while (rep){
        Scanner ler = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("     Bem vindo, usuário");
        System.out.println("==========================");

        String cpf;
        double saldo = 1000.00;
        int deposito,saque;

        System.out.println("Insira seu CPF:");
        cpf = ler.next();

        if(!cpf.equals("123.456.789-00")){
            System.out.println("Acesso negado!");
        }else{
            String password;
            int tries = 3;
            boolean acess = false;
            while(acess == false){
                while(tries > 0){
                    System.out.println("Insira sua senha:");
                    password = ler.next();
                    if(!password.equals("01020304")){
                        tries--;
                        System.out.println("Tentativas restantes: "+tries);
                    }else{
                        acess = true;
                        break;
                    }
                }
                break;
            }
            while(acess == true){
                int opcao;
                System.out.println("Escolha uma opção:\n 1 – Saldo \n 2 – Depósito \n 3 – Saque  \n 0 – Sair");
                opcao = ler.nextInt();
                switch(opcao){
                    case 1:
                        System.out.println("Seu saldo atual é: "+saldo);
                        break;
                    case 2:
                        System.out.println("Insira o valor a ser depositado: ");
                        deposito = ler.nextInt();
                        saldo += deposito;
                        break;
                    case 3:
                        System.out.println("Insira o valor a ser sacado: ");
                        saque = ler.nextInt();
                        saldo -=saque;
                        break;
                    case 0:
                        System.out.println("Saindo da conta. Obrigado pela confiança!");
                        acess = false;
                        break;
                }
            }
        }
    }}}