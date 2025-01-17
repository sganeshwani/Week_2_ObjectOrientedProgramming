import java.util.*;
class Circle
{
    double radius;//create one variable name is radius
    Circle(double radius)//make default constructor to initialize the value
    {
        this.radius=radius;
    }
    double calculateAreaOfCircle()//method to calculate the area of circle
    {
        return Math.PI *radius *radius;
    }
    double calculateCircumference()//method to calculate the circumference of circle
    {
        return 2* Math.PI *radius;
    }
    void displayResult()// method to display the result
    {
        System.out.println("The area of circle is :"+calculateAreaOfCircle());
        System.out.println("The circumference of circle is :"+calculateCircumference());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // take user input as radius
        double radius=sc.nextDouble();
        Circle cr=new Circle(radius);
        cr.displayResult();
    }
}