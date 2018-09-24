import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by geraldoswald on 24/9/18.
 */
public class JColorFrame extends JFrame
{
    JButton changeColor = new JButton("Change Color");
    JLabel red = new JLabel("Red");
    JLabel green = new JLabel("Green");
    JLabel blue = new JLabel("Blue");
    JLabel yellow = new JLabel("Yellow");
    Container con = getContentPane();
    Color [] colors = {Color.red, Color.green, Color.blue, Color.yellow};
    int counter = 0;

    public JColorFrame()
    {
        red.setBackground(Color.red);
        con.setLayout(new BorderLayout());
        con.add(changeColor, BorderLayout.CENTER);
        con.add(red, BorderLayout.WEST);
        con.add(green, BorderLayout.NORTH);
        con.add(blue, BorderLayout.EAST);
        con.add(yellow, BorderLayout.SOUTH);

        changeColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(counter == 0)
                {
                    changeColor.setBackground(colors[counter]);
                    counter ++;
                }
                else if (counter == 1)
                {
                    changeColor.setBackground(colors[counter]);
                    counter ++;
                }
                else if (counter == 2)
                {
                    changeColor.setBackground(colors[counter]);
                    counter ++;
                }
                else {
                    changeColor.setBackground(colors[0]);
                    counter = 1;
                }
            }
        });
    }

    public static void main(String[] args)
    {
        JColorFrame frame = new JColorFrame();
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

    }
}
