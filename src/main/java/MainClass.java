import java.util.Scanner;

/**
 * @author Егоров Владислав
 * @version 1.0.0
 */

public class MainClass {

    public static void main(String[] args) {
        double result = new MainClass().summation();
        System.out.println(result);
        System.out.printf("Результат: %.4f", result);
    }

    /**
     * @return Возвращается результат сложения дробных чисел
      */
    public double summation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число - ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите второе число - ");
        double secondNumber = scanner.nextDouble();

        double result = firstNumber + secondNumber;

        return result;
    }


}
