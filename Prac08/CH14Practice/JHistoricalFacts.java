package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout appLabel = new FlowLayout();
    JLabel[] labels = new JLabel[5];
    JLabel lbl2 = new JLabel("Label 2");
    JLabel lbl3 = new JLabel("Label 3");
    JLabel lbl4 = new JLabel("Label 4");
    JLabel lbl5 = new JLabel("Label 5");
    JButton button1 = new JButton ("Change Label");
    public int z = 0;
    public JHistoricalFacts()
    {
        super("Label Change");
        setSize(300, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(appLabel);
        makeLabels();
        add(button1);
        add(labels[0]);

        button1.addActionListener(this);
        setVisible(true);

    }
    public void makeLabels()
    {
        for(int x = 0 ; x < 5 ; x ++)
        {
            labels[x] = new JLabel("This is Label " + x);
        }
    }
    public static void main(String[] args)
    {
        JHistoricalFacts history = new JHistoricalFacts();

    }
    @Override
    public void actionPerformed(ActionEvent w)
    {
        if (z < 4)
        {
            remove(labels[z]);
            add(labels[(z + 1)]);
            z ++;

        }
        else {
            remove(labels[z]);
            add(labels[0]);
            z = 0;
        }

        validate();
        repaint();
    }


}
