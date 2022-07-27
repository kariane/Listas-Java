import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
   Scanner leitor=new Scanner(System.in);
    System.out.println("Digite o código da peça: ");
        String cpeça=leitor.next(); 
    System.out.println("Digite o valor da peça: ");
        float vpeça=leitor.nextFloat();
    System.out.println("Quantidade de peças: ");
        int qpeça=leitor.nextInt();
    float valorpedido= vpeça*qpeça;
        System.out.println("O código do pedido é o " + cpeça +" e o valor do pedido é: " + valorpedido);
}
}