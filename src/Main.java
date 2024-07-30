public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(3,5);
        Square s1 = new Square(8,9,10);
        s1.setX(2);
        s1.setY(4);
        s1.setSideLength(100);
        s1.setDot(d1);

        System.out.println(s1);
    }
}