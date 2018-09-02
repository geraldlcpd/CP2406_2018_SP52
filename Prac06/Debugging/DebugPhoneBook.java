package Debugging;
import javax.swing.*;
public class DebugPhoneBook extends FixDebugBook
{
    private int pages;
    private int city;
    private String area;
    private String size;
    private final int CUTOFF = 30;
    public DebugPhoneBook(int pages, int city)
   {
      super();
      area = Integer.toString(city);
      if(pages < CUTOFF)
         size = "big";
      else
         size = "small";
   }

    public DebugPhoneBook() {
       super();
       pages = 30;
       city = 2;
    }

    public void display()
   {
      JOptionPane.showMessageDialog(null,"The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}