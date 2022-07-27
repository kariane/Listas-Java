import java.util.Scanner;
public class exercicio9_aula7Abenza {
    public static void main(String[] args) {
      Scanner leitor=new Scanner(System.in);
        System.out.println("Valor do produto incialmente: ");
    float num=leitor.nextFloat();
       if(num<20){
        System.out.println("O valor final do produto é:"+(num+num*0.30));
    }
       else{
            System.out.println("O valor final do produto é: "+(num+num*0.45));
        }
}
}
 