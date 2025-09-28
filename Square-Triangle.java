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
public class Triangle extends Shape {
    
    private int base;
    private int height;
    
    public Triangle(String loc, int base, int height) {
        super(loc);
        this.base = base;
        this.height = height;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public void calculateArea() {
        double area=0.5*getBase()*getHeight();
        System.out.print("The Area of Square is:"+""+area);}
}