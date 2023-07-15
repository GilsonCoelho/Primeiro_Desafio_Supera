import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor ;
        valor = scan.nextDouble();

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int moeda1 = 0;
        int moeda50 = 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda05 = 0;
        int moeda01 = 0;

        if(valor >= 100){
            nota100 = (int) (valor/100);
            valor = valor%100;
            System.out.println(nota100);
            System.out.println(valor);
        }
        if(valor >= 50){
            nota50 = (int) (valor/50);
            valor = valor%50;
            System.out.println(nota50);
            System.out.println(valor);

        }
        if(valor >= 20){
            nota20 = (int) (valor/20);
            valor = valor%20;

            System.out.println(nota20);
            System.out.println(valor);
        }
        if(valor >= 10){
            nota10 = (int) (valor/10);
            valor = valor%10;

            System.out.println(nota10);
            System.out.println(valor);
        }
        if(valor >= 5){
            nota5 = (int) (valor/5);
            valor = valor%5;

            System.out.println(nota5);
            System.out.println(valor);
        }
        if(valor >= 2){
            nota2 = (int) (valor/2);
            valor = valor%2;
            System.out.println(nota2);
            System.out.println(valor);
        }
        if(valor >= 1){
            moeda1 = (int) (valor/1);
            valor = valor%1;
        }
        if(valor >= 0.50){
            moeda50 = (int) (valor/0.50);
            valor = valor%0.50;
        }
        if(valor >= 0.25){
            moeda25 = (int) (valor/0.25);
            valor = valor%0.25;
        }
        if(valor >= 0.10){
            moeda10 = (int) (valor/0.10);
            valor = valor%0.10;
        }
        if(valor >= 0.05){
            moeda05 = (int) (valor/0.05);
            valor = (valor%0.05);
        }
        if(valor >= 0.01){
            moeda01 = (int) (valor/0.01);
        }
        System.out.println("Notas:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("Moedas:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25+ " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");




        scan.close();
    }
}
