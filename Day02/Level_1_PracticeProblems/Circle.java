import java.util.*;
public class Circle {

    // data member radius
    double radius;

    //default constructor
    Circle(){
        this.radius = 7;
    }

    //parameterized constructor
    Circle(double radius){
        this.radius = radius;
    }

    public void display(){
        System.out.println("The radius of the Circle is: " + radius);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Circle radiusOfCircle = new Circle();

        //Take radius input from user
        System.out.print("Enter the radius of Circle: ");
        double userRadius = sc.nextDouble();
        Circle radiusOfCircle2 = new Circle(userRadius);

        //display radius
        radiusOfCircle.display();
        radiusOfCircle2.display();
        
    }
}
