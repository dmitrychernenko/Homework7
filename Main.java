public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle(10, 15);
        shapes[1] = new Rectangle(12, 7);
        shapes[2] = new Rectangle(17, 11);
        shapes[3] = new Rectangle(8,13);
        shapes[4] = new Circle(10);
        shapes[5] = new Circle(13);
        shapes[6] = new Circle(15);
        shapes[7] = new Triangle(10, 12, 15);
        shapes[8] = new Triangle(8,11, 16);

        arrayPrint(shapes);

        System.out.println("General area is: " + generalArea(shapes));

        System.out.println("Total rectangles areas is: " + figuresAreas(shapes)[0] +
                "\nTotal circles areas is: " + figuresAreas(shapes)[1] +
                "\nTotal triangles areas is: " + figuresAreas(shapes)[2]);
    }

    public static void arrayPrint(Shape[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i].to_string();
            System.out.println("Area of figure is: " + array[i].calcArea());
        }
    }

    public static double generalArea(Shape[] array)
    {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i].calcArea();
        }
        return sum;
    }

    public static double[] figuresAreas(Shape[] array)
    {
        double[] figuresAreas = new double[3];
        double rectanglesAreas = 0;
        double circlesAreas = 0;
        double trianglesAreas = 0;

        for (int i = 0; i < array.length; i++)
        {
            if(array[i] instanceof Rectangle) rectanglesAreas += array[i].calcArea();
            else if(array[i] instanceof Circle) circlesAreas += array[i].calcArea();
            else if(array[i] instanceof Triangle) trianglesAreas += array[i].calcArea();
        }

        figuresAreas[0] = rectanglesAreas;
        figuresAreas[1] = circlesAreas;
        figuresAreas[2] = trianglesAreas;

        return figuresAreas;
    }
}
