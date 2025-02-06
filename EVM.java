import java.util.Scanner;

class EVM {
    public static void main(String[] args) {
        System.out.println("     WELCOME     ");
        int bjp = 0, cn = 0, nota = 0;
        
        System.out.print("POPULATION: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        
        for (int i = 1; i <= p; i++) {
            System.out.println();
            System.out.println("**** LIST ****");
            System.out.println();
            System.out.println("1: BJP ");
            System.out.println("2: CONGRESS");
            System.out.println("3: NOTA");
            System.out.println();
            System.out.print("ENTER: ");
            int opt = sc.nextInt();

            if (opt >= 1 && opt <= 3) {
                if (opt == 1)
                    bjp++;
                else if (opt == 2)
                    cn++;
                else
                    nota++;
            } else {
                System.out.println("INVALID INPUT. Please try again.");
                i--; // Decrement counter to reattempt input
            }
        }

        // Display final results
        System.out.println("\n**** RESULTS ****");
        System.out.println("BJP Votes: " + bjp);
        System.out.println("CONGRESS Votes: " + cn);
        System.out.println("NOTA Votes: " + nota);

        // Determine the winner
        if (bjp > cn && bjp > nota) {
            System.out.println("\nBJP WINS THE ELECTION!");
        } else if (cn > bjp && cn > nota) {
            System.out.println("\nCONGRESS WINS THE ELECTION!");
        } else if (nota > bjp && nota > cn) {
            System.out.println("\nNOTA RECEIVED THE HIGHEST VOTES. NO WINNER!");
        } else {
            System.out.println("\nELECTION RESULTED IN A TIE!");
        }

        
    }
}
