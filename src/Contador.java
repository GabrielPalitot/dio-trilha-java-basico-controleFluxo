import java.util.Locale;
import java.util.Scanner;


public class Contador {

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        terminal.nextLine();
        System.out.println("Digite o segundo parametro:");
        int parametroDois = terminal.nextInt();
        terminal.nextLine();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }



}
