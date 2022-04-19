import java.util.Scanner;
public class LinearEquation {
    // Declaration of Variables
    private double a,b,c,d,e,f;
    public LinearEquation(double a1,double b1,double c1,double d1,double e1,double f1)
    {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e  = e1;
        f = f1;
    }
    // Getter Methods for all variables
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    // Calculation of X value from input values
    public double getX()
    {
        double x = ((e*d) - (b*f))/((a*d) - (b*c));
        return x;
    }
    // Calculation of Y value from input values
    public double getY()
    {
        double y = ((a*f) - (e*c))/((a*d) - (b*c));
        return y;
    }
    // Check whether the equation is solvable
    public boolean isSolvable()
    {
        if(((a*d) - (b*c)) == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter values of a, b, c, d, e and f ");
        // Scanner function to read input from user
        Scanner s = new Scanner(System.in);
        double a1 = s.nextDouble();
        double b1 = s.nextDouble();
        double c1 = s.nextDouble();
        double d1 = s.nextDouble();
        double e1 = s.nextDouble();
        double f1 = s.nextDouble();
        // Creation of new object
        LinearEquation le = new LinearEquation(a1,b1,c1,d1,e1,f1);
        if (le.isSolvable())
        {
            System.out.println("The X and Y values for the Linear Equation is " + le.getX() + " , " + le.getY());
        }
        else
        {
            System.out.println("The equation has no solution");
        }
    }
}
