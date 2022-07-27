import java.util.Scanner;
public class exercicio9_aula52Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        float nota1=leitor.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        float nota2=leitor.nextFloat();
        System.out.println("Digite sua terceira nota: ");
        float nota3=leitor.nextFloat();
        float nota11=nota1*2;
        float nota22=nota2*3;
        float nota33=nota3*5;
        float media=(nota11+nota22+nota33)/(2+3+5);
        System.out.println("Média ponderada deste aluno é: "+ media);
    }
  
}
