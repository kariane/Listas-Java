import java.util.Scanner;
public class exercicio13_aula5Abenza {
    public static void main(String[] args) {
     Scanner leitor= new Scanner(System.in); 
        System.out.println("Digite sua nota do primeiro bimestre: ");
        float nota1=leitor.nextFloat();
        System.out.println("Digite sua nota do segundo bimestre: ");
        float nota2=leitor.nextFloat();
        float notasemestre=(float) ((nota1*3 + 2*nota2)/(2+3));
        System.out.println("Nota do semestre é: "+ notasemestre); 
    }
}
