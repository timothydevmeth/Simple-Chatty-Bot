import  java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input1 = scanner.nextLong();
        long count = 1;
        long fact = 1;
        while (count<=input1) {
            ++fact;
            count*=fact;
            
        }
        System.out.println(fact);
    }
}
