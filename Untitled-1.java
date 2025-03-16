
// LinearEquation.java
import java.util.Scanner;

class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a, b, c, d, e, f: ");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(),
                d = input.nextDouble(), e = input.nextDouble(), f = input.nextDouble();
        input.close();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x = " + equation.getX());
            System.out.println("y = " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}
