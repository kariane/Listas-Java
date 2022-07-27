import java.util.Scanner;
public class exercicio9_aula5Abenza {
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
        System.out.println("respostas: " +numero1+ "; " + numero2 +"; "+ numero3+"; " +numero4+ "; " +escrito1+ "; " +escrito2);

}
}