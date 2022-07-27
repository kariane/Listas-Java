import java.util.Scanner;
public class exercicio13_aula7Abenza {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        System.out.println("==TRIÂNGULO==");
        System.out.println("Primeiro lado: ");
        int la1=leitor.nextInt();
        System.out.println("Segundo lado: ");
        int la2=leitor.nextInt();
        System.out.println("Terceiro lado: ");
        int la3=leitor.nextInt();
        if(la1==la2&&la3==la2&&la3==la1){
            System.out.println("Este triângulo é equilátero");
        }if(la1==la2&&la3!=la1 ||la2==la3&&la1!=la3 ||la1==la3&&la3!=la2){
            System.out.println("Este triângulo é isósceles");
        }if(la1!=la2&&la3!=la1&&la2!=la1 ||la2!=la3&&la1!=la3&&la1!=la2 ||la1!=la3&&la3!=la2&&la2!=la1){
            System.out.println("Este triângulo é escaleno");
        }
        }
    }



