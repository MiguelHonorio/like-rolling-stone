package iniciante;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Teste2 {

    public static void main(String args[]){

        Scanner leia;
        leia =  new Scanner (System.in);
        int a;
        int b;
        int max = 60;
        System.out.println("Quantos Numeros");
        a = leia.nextInt();
        System.out.println("Quantos Jogos");
        b = leia.nextInt(); // essa variavel eu informo quantos jogos eu quero



     Random rng = new Random();
     int i = 0;
     while(i < b) { //primeiro while para quantidade de jogos
     Set<Integer> generated = new LinkedHashSet<Integer>();
     while (generated.size() < a) //segundo while para a quantidade de números
     {
         Integer next = rng.nextInt(max) + 1;
         generated.add(next);
     }
     i++;
     System.out.println("Jogo " + i + " " + generated.toString());

     }

    }
}