import java.util.Scanner;
public class exercicio3_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("==MENU PRINCIPAL==");
        System.out.println("1-Fim"+"\n2-Cadastro"+"\n3-Consulta");
        System.out.println("Opção desejada: ");
        int opções=leitor.nextInt();
       if (opções==1 || opções==2 || opções==3){
            System.out.println("A opção escolhida foi a: "+ opções);
       }
 else{
            System.out.println("Opção não encontrada");
        }
       
    }
}
