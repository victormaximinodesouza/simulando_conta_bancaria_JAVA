package application;
import entities.Conta_bancaria;
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
        System.out.println("Digite número da conta: ");
        String titular  = sc.nextLine(); // Consumir a quebra de linha após o double
        System.out.println("Digite seu saldo:");
        double saldo = sc.nextDouble();
        Conta_bancaria conta = new Conta_bancaria(numeroAgencia, saldo, titular, cliente);
        System.out.println(conta);
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
