import java.util.Scanner;
public class exercicio4_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("==Questao 1==");
        System.out.println("Resolva: 5x-5+10=0");
        System.out.println("==Alternativas=="+"\na) 15"+"\nb) 1"+"\nc) -1"+"\nd) 2"+"\ne) 0");
        System.out.println("Alternativa desejada: ");
        String alternativas=leitor.nextLine();
        if(alternativas.equals("c")){
            System.out.println("A alternativa está correta");
        }
        else{
            System.out.println("Alternativa incorreta, tente novamente");
        }
    }
}
