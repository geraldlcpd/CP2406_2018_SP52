/**
 * Created by WTG10_64 on 3/9/2018.
 */
public class BookArray
{
    public static void main(String[] args)
    {
        Book[] books = new Book[5];

        books[0] = new Fiction("SF OCW");
        books[1] = new NonFiction("Java Programming");
        books[2] = new Fiction("Jurrasic Park");
        books[3] = new Fiction("Battle Networks OCW");
        books[4] = new NonFiction("Python Programming");

        for (int i = 0 ; i < 5 ; i ++)
        {
            System.out.println(books[i]);
            System.out.println();
        }

    }
}
