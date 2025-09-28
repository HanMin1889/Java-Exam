public abstract class Shape
{
    public String loc;
    public Shape(String loc) {
        super();
        this.loc = loc;
    }
    public abstract void calculateArea();
}

public class Square extends Shape
{
    int length = 0;
    int width = 0;
    public Square(String loc, int length, int width)
    {
        super(loc);
        this.length = length;
        this.width = width;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
}

public int getWidth(){
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    @Override
    public void calculateArea()
    {
      
        double area = getLength() * getWidth();
        System.out.println("The Area of Square is: " + area);
    }
}

public class Circle extends Shape
{
    public int radius;
    public Circle(String loc, int radius)
    {
        super(loc);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void calculateArea()
    {
        
        double area = Math.PI * radius * radius;
        System.out.println("The Area of Circle is: " + area);
    }
}

