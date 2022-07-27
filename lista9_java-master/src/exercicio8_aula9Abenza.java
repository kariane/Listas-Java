import java.util.Scanner;
public class exercicio8_aula9Abenza {
  public static void main(String args[]) {
 
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para efetuarmos as possíveis divisões: ");
        int num = leitor.nextInt();
        for(int va = num; va>0;va--){
            if(num%va==0){
        System.out.println(va);
            }
}}}
 

