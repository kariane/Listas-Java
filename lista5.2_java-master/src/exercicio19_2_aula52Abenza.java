import java.util.Scanner;
public class exercicio19_2_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Informe um número: ");
        float num1=leitor.nextFloat();
        System.out.println("Informe outro número: ");
        float num2=leitor.nextFloat();
        float multi=num1*100;
        float porcentagem= multi/num2;
        System.out.println("Utilizando a segunda alternativa o valor é: "+porcentagem+"%");
    }
}
