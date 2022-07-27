import java.util.Scanner;
public class exercicio5_aula5Abenza {
    public static void main(String[] args) {
        Scanner leitor= new Scanner (System.in);
        System.out.println("Cadastro de clientes");
        System.out.println("0-Fim");
        System.out.println("1-Inclui");
        System.out.println("2-Altera");
        System.out.println("3-Exclui");
        System.out.println("4-Consulta");
        System.out.println("opção:");
        int opçao=leitor.nextInt();
        System.out.println("A opção escolhida foi:" + opçao);      
    }
 
}
