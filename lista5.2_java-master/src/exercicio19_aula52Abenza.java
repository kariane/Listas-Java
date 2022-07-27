import java.util.Scanner;
public class exercicio19_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Informe um número: ");
        float num1=leitor.nextFloat();
        System.out.println("Informe outro: ");
        float num2=leitor.nextFloat();
        float porcentagem= (num1/num2)*100;
        System.out.println("Utilizando a primeira alternativa o valor é: "+porcentagem+"%");
    }
}
