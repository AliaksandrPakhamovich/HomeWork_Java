package Pizza;

public class CaloriesPizza {

    public double area2, area1, calories1, calories2, extraCalories, d1, d2, calories;

    public CaloriesPizza(double d1, double d2, double calories) {
        this.d1 =d1;
        this.d2 =d2;
        this.calories =calories;

        act1();
        act2();
        neg1();
        neg2();
        sub();

        printResult();
            }

            public void act1() {area1 = ((Math.pow(d1,2) / 4) * Math.PI);}
            public void act2() {area2 = ((Math.pow(d2,2) / 4) * Math.PI);}
            public void neg1() {calories1 = calories * area1;}
            public void neg2() {calories2 = calories * area2;}
            public void sub() {extraCalories = calories1 - calories2;}
        public void printResult(){System.out.printf("Разница калорий между пиццами: " + "%.2f",extraCalories); }

}
