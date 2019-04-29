public class Circle extends Shape
{
    double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void to_string()
    {
        System.out.println("Class: circle\nRadius: " + radius);
    }

    @Override
    public double calcArea()
    {
        return 3.14 * radius;
    }
}
