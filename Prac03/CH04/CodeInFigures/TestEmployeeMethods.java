package CH04.CodeInFigures;
public class TestEmployeeMethods
{
   public static void main(String[] args)
   {
      Employee2 aWorker = new Employee2();
      aWorker.setValues();
      aWorker.methodThatUsesInstanceAttributes();
      aWorker.methodThatUsesLocalVariables();
   }
}
