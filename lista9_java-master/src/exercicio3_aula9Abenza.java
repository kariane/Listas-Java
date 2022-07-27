import java.util.Scanner;
public class exercicio3_aula9Abenza {
   public static void main(String[] args) {
       Scanner leitor=new Scanner(System.in);
       int num2=1;
       System.out.println("Digite um número para fazermos a tabuada completa(de 1 a 10):");
       int num=leitor.nextInt();
  while(num2<=10){
    if(num<=10&&num>=0){
        System.out.println(num+"x"+num2+" é "+num*num2);
      }
      num2++;
       }
}
 
}
