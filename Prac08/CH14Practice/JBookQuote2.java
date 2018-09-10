package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JBookQuote2 extends JFrame implements ActionListener
{

    FlowLayout newApp = new FlowLayout();
    JLabel quote1 = new JLabel("This is Quote 1\n");
    JLabel quote2 = new JLabel("Quote of two");
    JButton btn1 = new JButton("Book");
    JLabel source1 = new JLabel("Book Source");
    public JBookQuote2(int size)
    {
        super("Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(size * 2, size);
        setLayout(newApp);
        add(quote1);
        add(quote2);
        add(btn1);
        btn1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(source1);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 quoteApp2 = new JBookQuote2(120);
        quoteApp2.setVisible(true);
    }


}

