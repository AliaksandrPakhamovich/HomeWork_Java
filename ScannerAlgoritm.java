package HomeWork;

import java.util.Scanner;

public class ScannerAlgoritm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number; // вводимое число
        int nsnumber; //основание системы счисления

        System.out.print("В какой системе счисления число?");
        nsnumber = Integer.parseInt(sc.nextLine());

        System.out.print("Введите число: ");
        number = Long.parseLong(sc.nextLine(), nsnumber);

        System.out.println("Число в 10-ой системе счисления: " + Long.toString(number,10));
        System.out.println("Число в 2-ой системе счисления: " + Long.toString(number,2));
        System.out.println("Число 8-ой системе счисления: " + Long.toString(number,8));
        System.out.println("Чмсло в 16-ой системе счисления: " + Long.toString(number,16));

        sc.close();

    }
}
