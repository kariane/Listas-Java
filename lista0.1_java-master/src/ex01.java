import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
Scanner leitor=new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas: ");
       float htrabalho=leitor.nextFloat();
        System.out.println("Valor de cada hora trabalhada: ");
       float valorhora=leitor.nextFloat();
       float salario= htrabalho*valorhora;
        System.out.println("Seu salário é: " + salario);
    }
    
}

