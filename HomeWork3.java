public class HomeWork3 {
    public static void main(String[] args) {
            //создайте три переменные типа char, равные 0,
            // разработайте подход для перевода значения из char в int тремя способами

        char q = '0';
        char w = '0';
        char e = '0';

        // способ №1
        int r = q;
        System.out.println(r);

        //способ №2
        String t = String.valueOf(w);
        int tt = Integer.parseInt(t);
        System.out.println(tt);

        //способ №3
        int a = Character.getNumericValue(e);
        System.out.println(a);

    }
}
