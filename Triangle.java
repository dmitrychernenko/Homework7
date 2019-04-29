public class Triangle extends Shape
{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void to_string()
    {
        System.out.println("Class: triangle\nA side: " + a + "\nB side: " + b + "\nC side: " + c);
    }

    @Override
    public double calcArea()
    {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
