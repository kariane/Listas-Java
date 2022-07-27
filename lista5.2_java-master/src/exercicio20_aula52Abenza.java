import java.util.Scanner;
public class exercicio20_aula52Abenza {
    public static void main(String[] args) {
      Scanner leitor=new Scanner(System.in);
        System.out.println("Informe um número: ");
        float num1=leitor.nextFloat();
        System.out.println("Informe um segundo número: ");
        float num2=leitor.nextFloat();
        float oposto= -num2;
        float inverso=1/num1;
        float diferença= num1-num2;
        double elevado=Math.pow(num1,num2);
        float so=(float) (num1*0.5);
        float soma=num2+so;
        float multi= (float) num1*num2;
        System.out.println("O oposto do segundo número é: "+oposto+"\nO inverso do primeiro número é: "+inverso+"\nA diferença do primeiro com o segundo:"+diferença+"\nPrimeiro número elevado ao segundo: "+elevado+"\nSegundo número mais metade do primeiro: "+soma+"\nMultiplicação dos dois valores: "+multi);
    }
 
}
