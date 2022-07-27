import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num1=leitor.nextInt();
        System.out.println("Digite outro número:");
        int num2= leitor.nextInt();
        System.out.println("Digite outro número");
        int num3=leitor.nextInt();
        double soma=Math.pow(num, 2);
        double soma1=Math.pow(num1, 2);
        double soma2=Math.pow(num2, 2);
        double soma3=Math.pow(num3, 2);
        int soma4=num+num1+num2+num3;
        System.out.println("A soma destes números é: " + soma4 + " e os quadrados de cada número é: " + soma +", " + soma1+ ", " +soma2+ " e " + soma3);
    }   
}
