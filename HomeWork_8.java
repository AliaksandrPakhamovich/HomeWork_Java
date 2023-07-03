public class HomeWork_8 {
    public static void main(String[] args) {
        // я сначала подумал, что слишком легко и просто в массив закину числа,
        // но попробовал не заводя числа в код, надеюсь для сдачи д\з пойдет
       int [] a = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int q = 10;
        int n = 1;

        for (int i = 0; i < q; i++) {
            System.out.print(n + " ");
            n *= 2;
    }
  }
}
