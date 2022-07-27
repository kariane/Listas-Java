import java.util.Scanner;
public class exercicio15_aula5Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        double quadrado=Math.pow(num, 2);
        double raiz=Math.sqrt(num);
        System.out.println("O quadrado é: " + quadrado + " A raiz desse número é: " + raiz);
    }
  
}
