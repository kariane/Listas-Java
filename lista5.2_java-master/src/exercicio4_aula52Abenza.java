import java.util.Scanner;
public class exercicio4_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
    float num=leitor.nextFloat();
        System.out.println("Digite outro número");
    float num1=leitor.nextFloat();
    double num2=Math.pow(num,3);
    double num3=Math.pow(num1,3);
    double soma=num2+num3;
        System.out.println("A soma dos cubos dos números digitados é: "+ soma);
    }
}
