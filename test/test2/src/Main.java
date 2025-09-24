import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("섭씨 온도를 입력하세요 : ");
        celsius = keyboard.nextDouble();

        fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.printf("섭씨 %.1f℃ = 화씨 %.1f℉\n", celsius, fahrenheit);
    }
}