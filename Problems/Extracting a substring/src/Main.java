import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println(str1.substring(int1,int2+1));

    }
}
