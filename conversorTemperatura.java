import java.util.Scanner;

public class conversorTemperatura {

    public static void main(String[] args) {
           
        //declaração de varivel
        double c, f;
        int op;

        //Criação e instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("\n\t\t\t -- Conversor de Temperaturas -- \n");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            op = entrada.nextInt();
            
            if(op == 1){
                System.out.println("\n\t\t\t -- Celsius para Fahrenheit -- \n");

                //Entrada 
                System.out.print("Informe os graus em Celsius:");
                c = entrada.nextDouble();

                //Processamento
                f = (9 * c) / 5 + 32;

                //Saida
                System.out.println("\n\t\t\t-- °" + c + " é igual à °" + f + " fahrenheit--\n");

            }else if(op == 2){
                System.out.println("\n\t\t\t -- Fahrenheit para Celsius -- \n");

                //Entrada
                System.out.print("Informe os graus em Fahrenheit: ");
                f = entrada.nextDouble();

                //Processamento
                c = (f - 32) * 5 / 9;

                //Saida
                System.out.println("\n\t\t\t-- °" + f + "° é igual à °" + c + " celsius --\n");
            
            }else if(op == 3){
                System.out.println("\n\t\t\t-- Forte Abraço! --\n");
                
            }else{
                System.out.println("\n\t\t\t -- Incorreto! escolha um número de 1 a 3 -- \n");
            }
        }while(op!=3);
    }
}