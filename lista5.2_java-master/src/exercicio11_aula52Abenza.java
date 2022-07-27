import java.util.Scanner;
public class exercicio11_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("CALCULANDO VALOR DO TERRENO");
        System.out.println("Comprimento do terreno em metros: ");
        float altura=leitor.nextFloat();
        System.out.println("Largura do terreno em metros: ");
        float base=leitor.nextFloat();
        System.out.println("Valor do metro quadrado: ");
        float valormetro=leitor.nextFloat();
        float m2=base*altura;
        float total= valormetro*m2;
        System.out.println("A área total do terreno é: "+m2+" e o preço do terreno é: "+total);
        
    }
  
}
