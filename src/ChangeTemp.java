import java.util.Scanner;

public class ChangeTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit,celsius;
        int choise;

        do {
            System.out.println("Menu");
            System.out.println("1.F to C");
            System.out.println("2.C to F");
            System.out.println("0.Exit");
            System.out.println("Enter your choise: ");
            choise = input.nextInt();

            switch (choise){
                case 1:
                    System.out.println("Enter F : ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter C : ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choise != 0);


    }
    public static double cToF(double celsius){
        double fahrenheit = (9.0 /5) * celsius +32;
        return fahrenheit;
    }
     public static double fToC(double fahrenheit){
        double celsius = (5.0 /9) * (fahrenheit -32);
        return celsius;
    }

}
