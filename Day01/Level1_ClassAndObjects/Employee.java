public class Employee
{
    String name;
    int id;
    double salary;
    Employee(String name,int id ,double salary)//make default constructor Employee
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    void displayDetail()//this method to display the detail of employee
    {
        System.out.println("Employee name :"+name);
        System.out.println("Employee id :"+id);
        System.out.println("Employee salary :"+salary);
    }
    public static void main(String[] args)//create an instance or object of the Employee
    {

        Employee emp=new Employee( "Sahil", 12345, 4500000.90);
        emp.displayDetail();
    }
}

