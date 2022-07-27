import java.util.Scanner;
public class exercicio11_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int nasc=leitor.nextInt();
        System.out.println("Ano atual: ");
        int atual=leitor.nextInt();
        int idade=atual-nasc;
        if(nasc>atual){
            System.out.println("Ano de nascimento ou ano atual informado errado, tente novamente");
        }
        else{
            System.out.println("Sua idade aproximada é: "+idade);
        }
    }
 
}
