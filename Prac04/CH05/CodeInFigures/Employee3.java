package CH05.CodeInFigures;
public class Employee3
{
   private int empNum;
   private double payRate;
   public int MAX_EMP_NUM = 9999;
   public double MAX_RATE = 60.00;
   public Employee3(int num, double rate)
   {
      if(num <= MAX_EMP_NUM)
         empNum = num;
      else
         empNum = MAX_EMP_NUM;
      if(payRate <= MAX_RATE)
         payRate = rate;
      else
         payRate = 0;
   }
   public int getEmpNum()
   {
      return empNum;
   }
   public double getPayRate()
   {
      return payRate;
   }
}
