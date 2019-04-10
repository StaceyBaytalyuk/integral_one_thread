import static java.lang.Math.cos;

public class IntegralCalculator {
    private double a, b, h;
    private int n;

    private static double f(double x) {
        return cos(x*x)/(x+1);
    }

    public IntegralCalculator(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.h = ( b - a ) / n;
    }

    public double leftRectangle() {
        double S = 0;
        for (int i = 0; i < n; i++) {
            double x = a + i*h;
            S += f(x);
        }
        return S*h;
    }

    public double rightRectangle() {
        double S = 0;
        for (int i = 1; i <= n; i++) {
            double x = a + i*h;
            S += f(x);
        }
        return S*h;
    }

    public double trapezoid() {
        double S = ( f(a) + f(b) ) / 2;
        for (int i=1; i<n; i++) {
            S += f(a + h*i);
        }
        return S*h;
    }

    public double simpson() {
        double S = f(a) + f(b);
        double sumOdd = 0;
        double sumEven = 0;
        for (int i=1; i<n-1; i+=2) {
            sumOdd += f(a + h*i);
        }
        for (int i=2; i<n-1; i+=2) {
            sumEven += f(a + h*i);
        }
        S += sumOdd*4 + sumEven*2;
        return S*h/3;
    }
}