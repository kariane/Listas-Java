import java.util.Scanner;
public class exercicio11_aula5Abenza {
    public static void main(String[] args) {
     Scanner leitor= new Scanner(System.in);  
        System.out.println("Digite um valor: ");
       int val1=leitor.nextInt();
        System.out.println("Digite outro valor: ");
       int val2=leitor.nextInt();
       int soma= val1 + val2;
        System.out.println("Soma: "+ soma);
        int diferença= val1-val2;
        System.out.println("Diferença: "+ diferença);
        int produto= val1*val2;
        System.out.println("Produto: " + produto);
        int quociente= val1/val2;
        System.out.println("Quociente: " + quociente);
        int resto= val1%val2;
        System.out.println("Resto da divisão: " + resto);
    }
   
}
