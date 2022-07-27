import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num1=leitor.nextInt();
        float soma= num*num1;
        System.out.println("O produto destes números é: " + soma);
    }    
}
