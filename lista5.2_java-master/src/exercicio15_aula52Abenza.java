import java.util.Scanner;
public class exercicio15_aula52Abenza {
    public static void main(String[] args) {
    Scanner leitor=new Scanner(System.in);
        System.out.println("Marca do aparelho: ");
        String marca=leitor.nextLine();
        System.out.println("Modelo do aparelho: ");
        String modelo=leitor.nextLine();
        System.out.println("preço de fábrica do aparelho: ");
        float pf=leitor.nextFloat();
        float vimposto=(float) (pf*0.28);
        float vrevendedor=(float) (pf*0.20);
        float soma= vimposto+vrevendedor+pf;
         System.out.println("A marca do aparelho é a: "+marca+"\nO modelo do aparelho é o: "+modelo+"\nValor total para o consumidor é: "+soma);
    }
   
}
