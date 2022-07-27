import java.util.Scanner;
public class exercicio8_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número: ");
    int num1=leitor.nextInt();
        System.out.println("Digite outro número: ");
    int num2=leitor.nextInt();
        System.out.println("Digite o operador desejado(+; -; *; /):");
        String operador=leitor.next();
      if(operador.equals("+")){
            System.out.println("De acordo com o operador desejado, o resultado é: "+(num1+num2));
      } if(operador.equals("-")){
            System.out.println("De acordo com o operador desejado, o resultado é: "+(num1-num2));
      } if(operador.equals("*")){
           System.out.println("De acordo com o operador desejado, o resultado é: "+(num1*num2)); 
        }else if(operador.equals("/")){
            System.out.println("De acordo com o operador desejado, o resultado é: "+num1/num2);
        } 
   }
  
}
