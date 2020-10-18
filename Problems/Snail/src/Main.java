import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int realheight = A - B;
        System.out.println((H + A - 2 * B - 1)/(A - B));
    }
}