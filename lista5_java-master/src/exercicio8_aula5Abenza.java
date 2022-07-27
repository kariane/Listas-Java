import java.util.Scanner;
public class exercicio8_aula5Abenza {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int numero2=leitor.nextInt();
        System.out.println("Digite um número decimal: ");
        float numero3=leitor.nextFloat();
        System.out.println("Digite outro número decimal: ");
        float numero4=leitor.nextFloat();
        System.out.println("Escreva algo: ");
        String escrito1=leitor.next();
        System.out.println("Escreva algo novamente: ");
        String escrito2=leitor.next();
        System.out.println("primeiro número: " +numero1);
        System.out.println("segundo número: " + numero2);
        System.out.println("primeiro número decimal : " +numero3);
        System.out.println("segundo número decimal: " + numero4);
        System.out.println("primeiro escrito: " +escrito1);
        System.out.println("segundo escrito: " +escrito2);
}      
}
