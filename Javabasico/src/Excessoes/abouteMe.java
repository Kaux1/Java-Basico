package Excessoes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class abouteMe {
    public static void main(String[] args) {
        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ola seja bem vindo!");
        System.out.println("digite seu nome:");
        String Nome = scanner.nextLine();
        System.out.println("digite seu sobrenome:");
        String Sobrenome = scanner.nextLine();
        System.out.println("digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("digite sua Altura:");
        double altura = scanner.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Não é possivel mudar o tipo de dado dos campos preenchidos");
            System.out.println("Preencha os campos corretamente!");

        }


        
    }
    
}
