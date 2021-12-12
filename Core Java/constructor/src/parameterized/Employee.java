package parameterized;

public class Employee
{
    private int eid;
    private String name;
    private float salary;
    private boolean graduate;

                public Employee()  //default constructor
                {
                    //code
                }
      
     public Employee(int eid,String name,float salary,boolean graduate)  //Paramereterized Constructor
        {
            eid=eid; // this.eid=eid
            this.name=name; //name=name
            this.salary=salary; // salary=salary
            this.graduate=graduate;//graduate=graduate
       }


      public void showInfo()  //non static
         {
           System.out.println(eid);      // Sopln(this.eid);
           System.out.println(name);   //Sopln(this.name);
           System.out.println(salary);    //Sopln(this.salary);
           System.out.println(graduate);   //Sopln(this.graduate);
          }

public static void main(String []args)
{
Employee emp=new Employee(101,"Shubhi Sharma" , 50000,true);
emp.showInfo();
}
}

