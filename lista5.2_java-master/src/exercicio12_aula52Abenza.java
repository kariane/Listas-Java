import java.util.Scanner;
public class exercicio12_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Valor pago: ");
        float pago=leitor.nextFloat();
        System.out.println("Valor de cada litro:");
        float vlitro=leitor.nextFloat();
        float litros= pago/vlitro;
        System.out.println("Litros colocados no tanque do carro: "+ litros);
    }
}
