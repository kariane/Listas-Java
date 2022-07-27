import java.util.Scanner;
public class exercicio12_aula5Abenza {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        System.out.println("Área do circulo");
        System.out.println("Informe o raio: ");
        float raio=leitor.nextFloat();
        double area= (float) (Math.PI * Math.pow(raio, 2));
        System.out.println("o resultado é: " + area);
        
    }
}
