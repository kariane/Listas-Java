import java.util.Scanner;
public class exercicio7_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite um número:");
        float num1=leitor.nextFloat();
        System.out.println("Digite outro número");
        float num2=leitor.nextFloat();
        int vish= (int) (num1/num2);
        if(num1==num2){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");   
        }if (num1>num2){
            System.out.println("O primeiro número é maior que o segundo");
        } else{
            System.out.println("O segundo número é maior que o primeiro");
        } if(num1<0){
            System.out.println("O primeiro número é negativo");
        } else if(num2<0)
            System.out.println("O segundo número é negativo");
        else{
            System.out.println("Nenhum é negativo");
        } 
        if(num2%num1==0){
            System.out.println("A divisão não tem resto");
        }
        else{
            System.out.println("A divisão tem resto");
        }
        
        
    }
 
}
