import java.util.Scanner;
public class exercicio1_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
    System.out.println("Nota do primeiro aluno: ");
        double num=leitor.nextDouble();
    System.out.println("Nota do segundo aluno: ");
        double num1=leitor.nextDouble();   
    System.out.println("Nota do terceiro aluno: ");
        double num2=leitor.nextDouble();
    double media= (num+num1+num2)/3;
        System.out.println("A media Aritmética é: "+media);
    }
}
