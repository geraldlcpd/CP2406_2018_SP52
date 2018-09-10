package CH14Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by geraldoswald on 10/9/18.
 */
public class JVacationRental extends JFrame implements ItemListener
{
    BorderLayout border = new BorderLayout();
    JPanel panel = new JPanel();
    Font newFont = new Font("Courier", Font.PLAIN, 24);
    protected int locPrice, bedPrice, mealPrice, totalPrice;

    ButtonGroup locGrp = new ButtonGroup();
    final int PARKPRICE = 600, POOLPRICE = 750, LAKEPRICE = 825;
    JRadioButton parkBtn = new JRadioButton("Parkside", false);
    JRadioButton poolBtn = new JRadioButton("Poolside", false);
    JRadioButton lakeBtn = new JRadioButton("Lakeside", false);

    ButtonGroup bedGrp = new ButtonGroup();
    final int ONEBED = 0, TWOBEDS = 75, THREEBEDS = 150;
    JRadioButton oneBed = new JRadioButton("One Bed", false);
    JRadioButton twoBed = new JRadioButton("Two Bed", false);
    JRadioButton triBed = new JRadioButton("Three Bed", false);

    ButtonGroup mealGrp = new ButtonGroup();
    final int INCLMEAL = 200, EXCLMEAL = 0;
    JRadioButton inclMeal = new JRadioButton("With Meal", false);
    JRadioButton exclMeal = new JRadioButton("No Meal", false);

    JLabel priceOutput = new JLabel("");
    String output;

    public JVacationRental()
    {
        super("J Vacation");
        setSize(300, 200);
        setResizable(false);
        panel.setSize(100,200);
        setDefaultCloseOperation(3);
        setLayout(border);
        add(priceOutput, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        locGrp.add(parkBtn);
        locGrp.add(poolBtn);
        locGrp.add(lakeBtn);
        parkBtn.addItemListener(this);
        poolBtn.addItemListener(this);
        lakeBtn.addItemListener(this);

        bedGrp.add(oneBed);
        bedGrp.add(twoBed);
        bedGrp.add(triBed);
        oneBed.addItemListener(this);
        twoBed.addItemListener(this);
        triBed.addItemListener(this);

        mealGrp.add(inclMeal);
        mealGrp.add(exclMeal);
        inclMeal.addItemListener(this);
        exclMeal.addItemListener(this);

        panel.add(parkBtn);
        panel.add(poolBtn);
        panel.add(lakeBtn);
        panel.add(oneBed);
        panel.add(twoBed);
        panel.add(triBed);
        panel.add(inclMeal);
        panel.add(exclMeal);
        //add(priceOutput);
        setVisible(true);

    }
    public static void main(String[] args)
    {
        JVacationRental newVacation = new JVacationRental();
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        if(source == parkBtn)
            locPrice = PARKPRICE;
        else if(source == poolBtn)
            locPrice = POOLPRICE;
        else if(source == lakeBtn)
            locPrice = LAKEPRICE;

        if(source == oneBed)
            bedPrice = ONEBED;
        else if(source == twoBed)
            bedPrice = TWOBEDS;
        else if(source == triBed)
            bedPrice = THREEBEDS;

        if (source == inclMeal)
            mealPrice = INCLMEAL;
        else if(source == exclMeal)
            mealPrice = EXCLMEAL;

        totalPrice = locPrice + bedPrice + mealPrice;
        priceOutput.setFont(newFont);
        priceOutput.setAlignmentY(CENTER_ALIGNMENT);
        priceOutput.setText("$" + Integer.toString(totalPrice));
    }
}
