package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JBookQuote extends JFrame
{
    protected int size = 60;
    FlowLayout newApp = new FlowLayout();
    JLabel quote1 = new JLabel("This is Quote 1\n");
    JLabel quote2 = new JLabel("Quote of two");
    public JBookQuote(int size)
    {
        super("Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(size * 2, size);
        setLayout(newApp);
        add(quote1);
        add(quote2);
    }
    public static void main(String[] args)
    {
        JBookQuote quoteApp = new JBookQuote(120);
        quoteApp.setVisible(true);
    }
}
