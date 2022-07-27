import java.util.Scanner;
public class exercicio8_aula52Abenza {
    public static void main(String[] args) {
    Scanner leitor=new Scanner(System.in);
        System.out.println(" Digite sua idade em dias: ");
        int dias=leitor.nextInt();
        int mudança=dias%365;
        int anos=dias/365;
        int meses=mudança/30;
        int dias1=mudança%30;       
        System.out.println("Em ano é: "+ anos + "\nEm meses é: "+ meses +"\nEm dias é: " + dias1);
    }
}
