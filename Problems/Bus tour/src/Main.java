import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accident = 0;
        int busheight = scanner.nextInt();
        int numofbridges = scanner.nextInt();
        for (int bridgecount = 0; bridgecount<=numofbridges; ++bridgecount) {
            int bridgeheight = scanner.nextInt();
            if (bridgeheight<busheight) {
                System.out.println("Will crash on bridge " + bridgecount);
                accident = bridgecount;
                break;
            }
        }
        }
        if ( == 0) {

    }

    }