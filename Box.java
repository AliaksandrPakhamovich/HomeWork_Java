public class Box {

        // Создайте класс Box, в котором будут три поля: ширина, высота, длина этой коробки.
        // Создайте внутри этого класса конструктор, который принимает 3 значения и определяет их в вышеописанные поля,
        // помимо этого в конструкторе подсчитывается объём коробки и печатается на экран.

    public double width;
    public double height;
    public double lenght;


    public Box(double width, double height, double lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;

        System.out.print("box volume: " + (width * height * lenght) / 1000000);
        System.out.print(" m3");

    }

}

