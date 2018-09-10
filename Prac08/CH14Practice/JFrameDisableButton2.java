package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    int clickTime = 1;
    JButton btn1 = new JButton("Click");
    JLabel btnClick = new JLabel();
    public JFrameDisableButton2()
    {
        super("Disable Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(btn1);
        add(btnClick);
        btn1.addActionListener(this);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton2 newDisable = new JFrameDisableButton2();
        newDisable.setSize(300, 300);
        newDisable.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent x)
    {
        if (clickTime < 9) {
            btnClick.setText(Integer.toString(clickTime));
            clickTime++;
        }
        else
        {
            btn1.setEnabled(false);
            add(new JLabel("Button has been clicked 8 times"));
        }

        validate();
        repaint();
    }
}
