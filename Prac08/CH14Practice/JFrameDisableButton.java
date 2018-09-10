package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JFrameDisableButton extends JFrame implements ActionListener
{
    JButton btn1 = new JButton("Click");
    public JFrameDisableButton()
    {
        super("Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(btn1);
        btn1.addActionListener(this);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton newDisable = new JFrameDisableButton();
        newDisable.setSize(300, 300);
        newDisable.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent x)
    {
        btn1.setEnabled(false);
        validate();
        repaint();
    }
}
