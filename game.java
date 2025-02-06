import java.util.Scanner;

class StonePaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;

        // Randomly generate 1, 2, or 3
        for (;;) {
            int n = (int) (Math.random() * 10);
            if (n >= 1 && n <= 3) {
                r = n;
                break;
            }
        }

        // Mapping numbers to choices
        String c = null;
        if (r == 1) {
            c = "STONE";
        } else if (r == 2) {
            c = "PAPER";
        } else if (r == 3) {
            c = "SCISSOR";
        } else {
            System.out.println("INVALID");
            return;
        }

        // Display options
        System.out.println("***** WELCOME *****");
        System.out.println();
        System.out.println("1. STONE  2. PAPER  3. SCISSOR");
        System.out.println();
        System.out.print("Choose your option: ");
        int o = sc.nextInt();

        String u = null;
        if (o == 1) {
            u = "STONE";
        } else if (o == 2) {
            u = "PAPER";
        } else if (o == 3) {
            u = "SCISSOR";
        } else {
            System.out.println("INVALID OPTION");
            return;
        }

        // Display choices
        System.out.println("USER: " + u);
        System.out.println("BOT: " + c);
        System.out.println();

        // Determine winner
        if ((o == 1 && r == 3) || (o == 2 && r == 1) || (o == 3 && r == 2)) {
            System.out.println("USER WINS!");
        } else if ((o == 1 && r == 2) || (o == 2 && r == 3) || (o == 3 && r == 1)) {
            System.out.println("BOT WINS!");
        } else {
            System.out.println("IT'S A TIE!");
        }
    }
}
