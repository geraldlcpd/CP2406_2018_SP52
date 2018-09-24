import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by geraldoswald on 24/9/18.
 */
public class JMovieFrame extends JFrame
{
    JButton leftMov = new JButton("Left Movie");
    JButton northMov = new JButton("North Movie");
    JButton eastMov = new JButton("East Movie");
    JButton southMov = new JButton("South Movie");
    JLabel movieArt = new JLabel();
    Container con = getContentPane();

    public JMovieFrame()
    {
        setTitle("JMovieFrame");
        movieArt.setFont(new Font("Arial", Font.BOLD, 18));
        movieArt.setHorizontalAlignment(SwingConstants.CENTER);
        con.setLayout(new BorderLayout());
        con.add(leftMov, BorderLayout.WEST);
        con.add(northMov, BorderLayout.NORTH);
        con.add(eastMov, BorderLayout.EAST);
        con.add(southMov, BorderLayout.SOUTH);
        con.add(movieArt, BorderLayout.CENTER);

        leftMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("Left Movie Artist");
                movieArt.repaint();
            }
        });

        northMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("North Movie");
                movieArt.repaint();
            }
        });

        eastMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("East of East");
                movieArt.repaint();
            }
        });

        southMov.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                movieArt.setText("South MOVIE");
                movieArt.repaint();
            }
        });
    }

    public static void main(String[] args)
    {
        JMovieFrame add = new JMovieFrame();
        add.setDefaultCloseOperation(3);
        add.setSize(500,300);
        add.setVisible(true);
    }
}
