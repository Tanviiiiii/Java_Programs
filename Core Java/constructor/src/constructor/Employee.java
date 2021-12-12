package constructor;

public class Employee
{
    private int eid;
    private String name;
    private float salary;
    private boolean graduate;

             
 /*          public Employee() //Default Constructor || no need to write as by default it get created 
                {
                    //code
                }                      */

      public void showInfo()  //non static
         {
           System.out.println(eid);      // Sopln(this.eid);
           System.out.println(name);   //Sopln(this.name);
           System.out.println(salary);    //Sopln(this.salary);
           System.out.println(graduate);   //Sopln(this.graduate);
        }

public static void main(String []args)
{
Employee emp=new Employee();
emp.showInfo();
}
}