import java.util.Scanner;
public class exercicio5_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Escreva o ano que deseja saber se é bissexto: ");
        int bissexto=leitor.nextInt();
        if((bissexto%400==0) ||(bissexto%4==0)&&(bissexto%100!=0)){
            System.out.println("Este ano é bissexto");
        }
        else{
            System.out.println("este ano não é bissexto");
    }
   }
}

