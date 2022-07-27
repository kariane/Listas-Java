import java.util.Scanner;
public class exercicio3_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int nu=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int num1=leitor.nextInt();
      float produto=nu*num*num1;
        System.out.println("O produto destes valores é: "+produto);
    }
}
