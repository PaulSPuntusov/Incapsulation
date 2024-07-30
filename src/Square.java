public class Square {
    private int x, y, sideLength;

    private Square(int x, int y, int sideLength) {
        isPositive(sideLength);
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }
    private Square(Dot dot, int sideLength){
        isPositive(sideLength);
        this.x = dot.x;
        this.y = dot.y;
        this.sideLength = sideLength;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setDot(Dot dot){
        setX(dot.x);
        setY(dot.y);
    }

    public void setSideLength(int sideLength) {
        isPositive(sideLength);
        this.sideLength = sideLength;
    }

    private void isPositive(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны квадрата должна быть больше 0");
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке Т:{" +
                "x=" + x +
                ", y=" + y +
                ", со стороной N=" + sideLength +
                '}';
    }
}
