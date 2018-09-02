package Debugging;
public class FixDebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public FixDebugCustomer()
    {
        this.idNumber = 0;
        this.name = "Employee";
        this.creditLimit = 0;
    }


    public FixDebugCustomer(int id, String name, double credit)
    {
       this.idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
