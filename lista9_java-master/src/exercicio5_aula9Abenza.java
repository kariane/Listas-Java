import java.util.Scanner;
public class exercicio5_aula9Abenza {
   public static void main(String[] args) {
       Scanner leitor=new Scanner(System.in);
       int num=1, num2;
       while(num<=5){
       System.out.print("Digite o "+num+"° número:");
          num2=leitor.nextInt();
          num++;
    if(num2%2==0){
        System.out.println("O "+num+"° número é par");  
    }else{
        System.out.println("O primeiro número é ímpar");
    }
       }
      }}