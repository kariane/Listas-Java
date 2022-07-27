import java.util.Scanner;
public class exercicio12_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Primeira nota do aluno: ");
        float nota1=leitor.nextFloat();
        System.out.println("Segunda nota do aluno: ");
        float nota2=leitor.nextFloat();
        System.out.println("Terceira nota do aluno: ");
        float nota3=leitor.nextFloat();
        float media=(nota1+nota2+nota3)/3;
        if(media>=8&&media<=10){
            System.out.println("Nota A");
        } if(media>=7&&media<8){
            System.out.println("Nota B");
        }  if(media>=5&&media<7){
            System.out.println("Nota C");
        } if(media>=4&&media<5){
            System.out.println("Nota D");
        } if(media>=0&&media<4){
            System.out.println("Nota E");
        }
    }
 }
