import java.util.Scanner;
public class exercicio14_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um dia da semana usando numeral(lembrando que o 1 é domingo):");
        int sem=leitor.nextInt();
        if (sem==1){
            System.out.println("O dia é domingo");            
        } if (sem==2){
            System.out.println("O dia é segunda");
        } if (sem==3){
            System.out.println("O dia é terça");
        } if (sem==4){
            System.out.println("O dia é quarta");
        } if (sem==5){
            System.out.println("O dia é quinta");
        } if (sem==6){
            System.out.println("O dia é sexta");
        } if (sem==1){
            System.out.println("O dia é sábado");
        } else if(sem>=8||sem<1){
            System.out.println("O numeral informado não é um dia da semana");
        }
  }
 
}
