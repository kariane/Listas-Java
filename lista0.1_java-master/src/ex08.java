import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num1=leitor.nextInt();
        int soma= num+num1;
        System.out.println( "Os números desta conta são:" + num + " e " + num1 + " a soma destes números é: " + soma);
    }    
}
