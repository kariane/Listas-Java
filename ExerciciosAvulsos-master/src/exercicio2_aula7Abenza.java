import java.util.Scanner;
public class exercicio2_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int nasc=leitor.nextInt();
        boolean resultado = nasc>1990;
        System.out.println("Você nasceu depois de 1990: "+resultado);
    }
}

