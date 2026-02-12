package application;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta_bancaria;
public class main {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    

    try{
        System.out.println("Digite seu nome:");
        String cliente = sc.nextLine();
        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = sc.nextLine();
        System.out.println("Digite seu saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // Consumir a quebra de linha após o double
        System.out.println("Digite o número da sua conta:");
        String numeroConta = sc.nextLine();
        System.out.println();

    }


    catch (InputMismatchException e){
        e.printStackTrace();
        System.out.println("Tente novamente");
        
    } 

    finally{
        sc.close();
    }
    









    }
}
