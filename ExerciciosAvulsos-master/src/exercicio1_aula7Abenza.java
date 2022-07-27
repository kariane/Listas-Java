import java.util.Scanner;
public class exercicio1_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int nasc=leitor.nextInt();
        System.out.println("Ano atual:");
        int atual=leitor.nextInt();
        int anos=atual-nasc;
        int meses=anos*12;
        int dias=meses*30;
        int horas=dias*24;
        int minutos=horas*60;
        System.out.println("Viveu aproximadamente: "+minutos+"minutos");
    }
 
}
