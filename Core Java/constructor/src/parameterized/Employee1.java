package parameterized;

public class Employee1
{
    private int eid;
    private String name;
    private float salary;
    private boolean graduate;

                public Employee1()  //default constructor
                {
                    //code
                }
      
     public Employee1(int eid,String name,float salary,boolean graduate)  //Paramereterized Constructor
        {
            eid=eid; // this.eid=eid
            this.name=name; //name=name
            this.salary=salary; // salary=salary
            this.graduate=graduate;//graduate=graduate
       }


      public void showInfo()  //non static
         {
	int eid=10;

           System.out.println(eid);      // Sopln(this.eid);  //priority goes to local therefore in print it will display 10 not 101.
           System.out.println(name);   //Sopln(this.name);
           System.out.println(salary);    //Sopln(this.salary);
           System.out.println(graduate);   //Sopln(this.graduate);
          }

public static void main(String []args)
{
Employee1 emp=new Employee1(101,"Shubhi Sharma" , 50000,true);
emp.showInfo();
}
}

