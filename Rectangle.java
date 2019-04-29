public class Rectangle extends Shape
{
    double width;
    double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void to_string()
    {
        System.out.println("Class: rectangle\nWidth: " + width + "\nHeight: " + height);
    }

    @Override
    public double calcArea()
    {
        return width * height;
    }
}
