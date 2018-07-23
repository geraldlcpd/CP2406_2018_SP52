package CH04;

/**
 * Created by jc477286 on 23/07/18.
 */
public class FormLetterWriter
{
    public static void main(String[] args)
    {
        FormLetterWriter obj = new FormLetterWriter();
        obj.displaySalutation("Forrest");
        obj.displaySalutation("Jackson", "Brown");
    }

    public void displaySalutation(String lName)
    {
        System.out.println("Dear Mr./Mrs. " + lName);
    }

    public void displaySalutation(String fName, String lName)
    {
        System.out.println("Dear Mr./Mrs. " + fName + " " + lName);
    }
}
