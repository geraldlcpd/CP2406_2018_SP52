package Debugging;
public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   public DebugMusical(String title, String author, String comp)
   {
      //super.DebugPlay("Title 2", "Author 2");
      DebugPlay new1 = new DebugPlay("Title 2", "Author 2");

      this.composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}