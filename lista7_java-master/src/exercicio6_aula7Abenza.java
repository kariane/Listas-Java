import java.util.Scanner;
public class exercicio6_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite um número:");
        float num1=leitor.nextFloat();
        System.out.println("Digite outro número");
        float num2=leitor.nextFloat();
        float num3=num1/num2;
        if(num2!=0){
            System.out.println("A divisão destes números é:"+num3);
        }
        else{
            System.out.println("Impossível efetuar está divisão");
        }
    }
  
}
