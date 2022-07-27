import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        double soma= Math.pow(num, 2);
        System.out.println("O quadrado deste número é: " +soma);
    }    
}
