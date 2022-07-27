import java.util.Scanner;
public class exercicio3_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int nasc=leitor.nextInt();
        System.out.println("Ano atual:");
        int atual=leitor.nextInt();
        System.out.println("Qual o seu sexo: ");
        String sexo=leitor.next();
        int idade=atual-nasc;
        boolean prova=idade>20;
        boolean result=sexo.equals("masculino");
        System.out.println("Tem mais de 20 anos? "+prova+"\nÉ do sexo masculino? "+result);
    }
 
}
