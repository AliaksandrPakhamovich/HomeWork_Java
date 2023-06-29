package Pizza;

public class PizzaOne {
       public static void main(String[] args) {

    double d1 = 24;
    double d2 = 28;
    double calories = 40;

   double extraCalories = (calories * ((Math.pow(d2,2) / 4 * Math.PI)) - (calories * (Math.pow(d1,2) / 4) * Math.PI));
        System.out.println("formula answer:" + extraCalories);

    CaloriesPizza p1 = new CaloriesPizza(24,28,40);

    }

}
