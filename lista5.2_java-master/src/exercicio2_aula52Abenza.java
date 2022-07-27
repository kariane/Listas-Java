import java.util.Scanner;
public class exercicio2_aula52Abenza {
    public static void main(String[] args) {
     Scanner leitor=new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String ncompleto=leitor.nextLine();
        System.out.println("Digite seu estado civil: ");
        String estadoc=leitor.nextLine();
        System.out.println("Digite seu endereço: ");
        String ende=leitor.nextLine();
        System.out.println("Digite seu telefone: ");
        String tele=leitor.nextLine();
        System.out.println("Ficha do cliente:\nNome completo: "+ncompleto+";\nEstado civil: "+estadoc+";\nEndereço: "+ ende+";\nTelefone: "+tele);
    } 
}
