import java.util.Scanner;
public class exercicio1_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();
        if(num>0){
            System.out.println("Número é positivo");
        }
         else if(num<0){
            System.out.println("Número é negativo");
          } else {
              System.out.println("Número é igual a zero");
        }
    }
}
