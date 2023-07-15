import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = 0;
        tamanho = scan.nextInt();
        int alvo = scan.nextInt();
        int valores[] = new int[tamanho];
        int count = 0;

        for(int i = 0 ; i < tamanho; i++){
            valores[i] = i +1;
        }
        for(int i = tamanho -1 ; i >= 0 ; i--){
            for(int j = 0 ; j < tamanho ; j++){
                if((valores[i] - valores[j] == alvo))
                    count++;
            }
        }
        System.out.println(count);

        scan.close();
    }
}
