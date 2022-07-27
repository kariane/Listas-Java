import java.util.Scanner;
public class exercicio10_aula52Abenza {
    public static void main(String[] args) {
    Scanner leitor=new Scanner(System.in);
        System.out.println(" Digite a duração em segundo: ");
        int segundo=leitor.nextInt();
        int alteração=segundo%3600;
        int horas=segundo/3600;
        int minutos=alteração/60;
        int segundos=alteração%60;       
        System.out.println("Em horas é: "+ horas + "\nEm minutos é: "+ minutos +"\nEm segundos é: " + segundos);
    }
}
