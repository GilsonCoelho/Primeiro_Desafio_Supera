import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor ;
        valor = scan.nextDouble();
        double[] notas = {100.00,50.00,20.00,10.00,5.00,2.00,1.00,0.50,0.25,0.10,0.05,0.01};
        int[] quantidades = new int[12];

        System.out.println("Notas:");

        for(int i = 0; i < 12; i++){
            if(i == 6) {
                System.out.println("Moedas:");
            }
            quantidades[i] = (int) (valor/notas[i]);
            valor = valor%notas[i];
            System.out.println(quantidades[i] + " nota(s) de R$ " + notas[i]);

        }

        scan.close();
    }
}
