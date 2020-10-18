import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.next();
        String upperNewString = newString.toUpperCase(); 
        boolean check = upperNewString.startsWith("J");
        System.out.println(check);
    }
}
