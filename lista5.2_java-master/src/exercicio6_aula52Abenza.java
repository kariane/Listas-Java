import java.util.Scanner;
public class exercicio6_aula52Abenza {
    public static void main(String[] args) {
      Scanner leitor=new Scanner(System.in);
        System.out.println("Nome do vendedor: ");
        String nome=leitor.nextLine();
        System.out.println("Digite o salário fixo deste vendedor: ");
        float safixo=leitor.nextFloat();
        System.out.println("Valor total de vendas efetuadas por este vendedor: ");
        float savendas=leitor.nextFloat();
       float porcentagem= (float) (savendas*0.15);
        System.out.println("Total recebido neste mês: "+(safixo + porcentagem));
    }
}
