import java.util.Scanner;
public class exercicio18_aula52Abenza {
    public static void main(String[] args) {
     Scanner leitor=new Scanner(System.in);
        System.out.println("Informe a temperatura que deseja em Celsius: ");
        float c=leitor.nextFloat();
        float k=(float)(c+273.15);
        float f=(float) (k*1.8-459.67);
        System.out.println("Esta temperatura em Kelvins é: "+k+" K"+"\n E em Fahrenheit é:"+f+" °F");        
    }
}
