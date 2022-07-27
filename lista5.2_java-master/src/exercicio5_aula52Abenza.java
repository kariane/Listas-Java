import java.util.Scanner;
public class exercicio5_aula52Abenza {
    public static void main(String[] args) {
     Scanner leitor=new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        float base=leitor.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float altura=leitor.nextFloat();
    float area=base*altura;
    double perimetro=4*Math.sqrt(area);
        System.out.println("A área do quadrado é: " + area+ " e o perimetro é:" + perimetro);
    
    }
}
