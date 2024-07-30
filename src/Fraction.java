public class Fraction {
    final int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        denominatorControl(denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                numerator +
                "/" + denominator +
                '}';
    }

    private static void denominatorControl(int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть больше нуля");
        }
    }


    public Fraction sum(int numerator, int denominator) {
        denominatorControl(denominator);
        int newDenominator = denominator * this.denominator;
        int newNumerator = ((numerator * this.denominator) + (this.numerator * denominator));
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        return newFraction;
    }

    public Fraction sum(int numerator) {
        return sum(numerator, 1);
    }

    public Fraction sum(Fraction f) {
        return sum(f.numerator, f.denominator);
    }

    public Fraction minus(int numerator, int denominator) {
        denominatorControl(denominator);
        int newDenominator = denominator * this.denominator;
        int newNumerator = ((numerator * this.denominator) - (this.numerator * denominator));
        Fraction newFraction = new Fraction(newNumerator, newDenominator);
        return newFraction;
    }

    public Fraction minus(int numerator) {
        return minus(numerator, 1);
    }

    public Fraction minus(Fraction f) {
        return minus(f.numerator, f.denominator);
    }
}
