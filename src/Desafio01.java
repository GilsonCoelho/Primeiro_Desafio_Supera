import java.util.*;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        n = scan.nextInt();

        for (int i =0 ; i < n ; i++){
            int entrada = scan.nextInt();
            if (entrada % 2 == 0){
                pares.add(entrada);
            }else{
                impares.add(entrada);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);

        for(int par: pares) System.out.println(par);
        for(int impar: impares) System.out.println(impar);




        scan.close();
    }
}
