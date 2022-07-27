import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite a cotação do dólar: ");
        float cdo=leitor.nextFloat();
        System.out.println("Digite a quantidade de dólar: ");
        int qdo=leitor.nextInt();
        float vreal= qdo*cdo;
        System.out.println("O valor é: " + vreal + " reais");
    }    
}