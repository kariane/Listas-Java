import java.util.Scanner;
public class exercicio2_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num=leitor.nextInt();        
        if (num%2==0){
            System.out.println("O número é par");               
        } 
        else {
            System.out.println("O número é impar");
        }
}
}
