import java.util.Scanner;
public class exercicio7_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva sua idade em anos: ");
        int anos=leitor.nextInt();
        System.out.println("Escreva sua idade em meses: ");
        int meses=leitor.nextInt();
        System.out.println("Escreva sua idade em dias: ");
        int dias=leitor.nextInt();
        float dia=(dias+(anos*365)+(meses*30));
        System.out.println("Sua idade em dias é: "+ dia);
    }
}
