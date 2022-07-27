import java.util.Scanner;
public class exercicio14_aula5Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Valor da base menor: ");
       float bmenor=leitor.nextFloat();
        System.out.println("Valor da base maior: ");
       float bmaior=leitor.nextFloat();
        System.out.println("Qual a altura: ");
       float altura=leitor.nextFloat();
      float area= (float) ((bmaior*bmenor) + altura)/2;
        System.out.println("A área é: " + area );
    }
}
