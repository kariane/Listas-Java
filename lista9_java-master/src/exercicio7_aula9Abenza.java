import java.util.Scanner;
public class exercicio7_aula9Abenza {
   public static void main(String[] args) {
       Scanner leitor=new Scanner(System.in);
       int num=1,num2,soma=0;
       while(num<=10){
       System.out.print("Digite o "+num+"° número:");
          num2=leitor.nextInt();
          soma+=num2;
          num++;
    }
       System.out.println("A soma destes valores é: "+soma);
       }
      }
