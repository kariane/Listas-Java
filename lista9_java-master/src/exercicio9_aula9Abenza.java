import java.util.Scanner;
public class exercicio9_aula9Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        String pa = "";
        while(pa.length()!=6){
        System.out.println("Digite uma palavra com 6 caracteres: ");
        pa=leitor.nextLine();
        if(pa.length()!=6){
            System.out.println("==Tente Novamente==");
        }
            System.out.println("A palavra digitada foi: "+ pa);
        }
    }
}
