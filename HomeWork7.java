import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0)
            System.out.println(number + " - чётное число");
            else
            System.out.println(number + " - нечётное число");
  }
}
