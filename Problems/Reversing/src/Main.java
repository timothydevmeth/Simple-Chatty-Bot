import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); 
        int lastdigit = input / 100;
        int mid = input % 100;
        int middigit = mid / 10 * 10;
        int firstdigit = mid % 10 * 100;
        System.out.println(firstdigit + middigit + lastdigit);
        
        
    }
}
