import java.util.Scanner;
public class exercicio15_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        String sem=leitor.next();
         if (sem.equals("domingo")){
            System.out.println("É o primeiro dia da semana");            
        }else if (sem.equals("segunda")){
            System.out.println("É o segundo dia da semana");
        }else if (sem.equals("terça")){
            System.out.println("É o terceiro dia da semana");
        }else if (sem.equals("quarta")){
            System.out.println("É o quarto dia da semana");
        }else if (sem.equals("quinta")){
            System.out.println("É o quinto dia da semana");
        }else if (sem.equals("sexta")){
            System.out.println("É o sexto dia da semana");
        }else if (sem.equals("sabádo")){
            System.out.println("É o sétimo dia da semana");
        } else {
            System.out.println("O que foi informado não é um dia da semana");
        } } }
 
