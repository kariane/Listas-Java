import java.util.Scanner;
public class exercicio4_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String num=leitor.nextLine();
        System.out.println("Confirme sua senha: ");
        String num1=leitor.nextLine();
        if(num.equals(num1)){
            System.out.println("Passe");
        }
        else{
            System.out.println("Senhas diferentes");
        }
    }
}
