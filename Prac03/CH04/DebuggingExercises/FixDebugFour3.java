// This class uses a FixDebugBox class to instantiate two Box objects
package CH04.DebuggingExercises;
public class FixDebugFour3
{
   public static void main(String args[])
   {
      int width = 12;
      int length = 10;
      int height = 8;
      FixDebugBox box1 = new FixDebugBox();
      FixDebugBox box2 = new FixDebugBox(width, length, height);
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.println("  The volume of the first box is " + box1.getVolume());
      System.out.println("The dimensions of the second box are");
      box2.showData();

      double volBox2 = box2.getVolume();
      System.out.print("  The volume of the second box is " + volBox2);
   }

}

