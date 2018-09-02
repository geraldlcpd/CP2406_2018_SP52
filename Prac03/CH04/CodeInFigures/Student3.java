package CH04.CodeInFigures;
public class Student3
{
   private static final int SCHOOL_ID = 12345;
   private int stuNum;
   private double gpa;

   public Student3(int stuNum, double gpa)
   {
     stuNum = stuNum;
     gpa = gpa;
   }
   public void showStudent()
   {
     System.out.println("Student3 #" + stuNum +
         " gpa is " + gpa);
   }
}
