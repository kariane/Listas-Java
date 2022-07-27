import java.util.Scanner;
public class exercicio10_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("Idade do nadador: ");
        int idade=leitor.nextInt();
        if(idade<=7&&idade>=5){
            System.out.println("Categoria Infantil A");
        }
        if(idade<=10&&idade>=8){
            System.out.println("Categoria Infantil B");
        }   
        if(idade<=13&&idade>=11){
            System.out.println("Categoria Juvenil A");
        }
        if(idade<=17&&idade>=14){
            System.out.println("Categoria Juvenil B");
        }
        else if(idade>=18){
            System.out.println("Categoria Sênior");
        }
    }
}
