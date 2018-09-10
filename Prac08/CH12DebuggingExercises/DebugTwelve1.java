// This class determines the logarithm of a number
package CH12DebuggingExercises;
public class DebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = 80, result;
     try
     {
        if(num <= 0)
           throw(new ArithmeticException());
        result = Math.log(num);
        System.out.println("Result is " + String.format("%.2f",result));
     }
     catch(ArithmeticException error)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}