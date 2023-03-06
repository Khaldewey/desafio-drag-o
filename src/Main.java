import java.util.Scanner;

public class Main {
   import java.util.*;
    public class Solution{

        public static void main(String[] args){
            int casos, poderDeLuta;

            Scanner ler = new Scanner(System.in);
            System.out.println("Digite a quantidade de casos");
            casos = ler.nextInt();

            for(int i = 0; i < casos; i++){
                System.out.println("Digite o poder de luta");
                poderDeLuta = ler.nextInt();



                if(poderDeLuta > 8000){
                    System.out.println("Mais de 8000!");
                } else {
                    System.out.println("Inseto!");
                }
            }
        }
    }
}