import java.util.Scanner;
public class exercicio13_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Base do triângulo: ");
        float base=leitor.nextFloat();
        System.out.println("Altura do triângulo: ");
        float altura=leitor.nextFloat();
        float area= (base*altura)/2;
        System.out.println("A área deste triângulo é: "+area);
    }
  
}
