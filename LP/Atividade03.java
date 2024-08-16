import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       System.out.println("informe o numero que temos: ");
       int num = input.nextInt();

       System.out.println("informe qual numero queremos chegar. Lmebrando que deve ser maior que o " + num);
       int esperado = input.nextInt();

       for(int i = num; i < esperado; i++){
        num += 1;

       }

       System.out.println("o numero inicial se tornou :" + num);
    }
}
