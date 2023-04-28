package HackerRank;

import java.util.Scanner;

public class JavaEndoffile {
    public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);

            int linha = 0;
            while (sc.hasNextLine()){
                linha++;
                String linhas = sc.nextLine();
                System.out.println(linha + " " + linhas);
        }


    }
}
