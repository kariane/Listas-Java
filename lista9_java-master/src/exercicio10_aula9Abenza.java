import java.util.Scanner;
public class exercicio10_aula9Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String pa=leitor.next();
        for(int oi=0; oi< pa.length(); oi++){
            char re=pa.charAt(oi);
            System.out.print("-");
            System.out.print(re);
        }
        
    }
}