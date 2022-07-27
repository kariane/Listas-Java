import java.util.Scanner;
public class exercicio14_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int nu1=leitor.nextInt();
        System.out.println("Digite outro número: ");
        int nu2=leitor.nextInt();
       float quociente=nu1/nu2;
        int resto= nu1%nu2;
        System.out.println("O quociente destes dois número é: "+ quociente+"\nO resto da divisão é: "+resto);
    }
}
