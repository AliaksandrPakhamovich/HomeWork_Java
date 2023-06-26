import java.util.Random;

public class WorkingDayTimer {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801);
        System.out.println("Оставшееся время в секундах: " + n);
        printRemainingHours(n);
    }
    public static void printRemainingHours(int seconds) {
        int remainingHours = seconds / 3600;

        if (remainingHours > 0) {
            System.out.println("Осталось часов: " + remainingHours );
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
