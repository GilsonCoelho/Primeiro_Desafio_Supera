import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticao = scan.nextInt();

        for (int i = 0 ; i < repeticao ; i++){
            String texto = readLine(scan);
            StringBuilder parte1 = new StringBuilder(texto.substring(0,texto.length() / 2));
            StringBuilder parte2 = new StringBuilder(texto.substring(texto.length() / 2, texto.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
        scan.close();
    }
    public static String readLine(Scanner scan){
        String linha = scan.nextLine();
        while (linha.isEmpty()){
            linha = scan.nextLine();
        }
        return linha;
    }
}
