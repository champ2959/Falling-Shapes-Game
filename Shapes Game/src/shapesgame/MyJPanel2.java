/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author emg5478
 */
public class MyJPanel2 extends JPanel {

    JSlider speed;
    JButton color;
    JLabel speedLabel;
    
    public MyJPanel2() {
        
        super();
        speed = new JSlider(JSlider.HORIZONTAL, 1, 3, 2);
        
        color = new JButton("Color");
        
        speedLabel = new JLabel("Speed: ");
        
        //Create the label table
        Hashtable labelTable = new Hashtable();
        labelTable.put(1, new JLabel("Slowest") );
        labelTable.put(2, new JLabel("Medium") );
        labelTable.put(3, new JLabel("Fast") );
        
        speed.setLabelTable(labelTable);
        speed.setMinorTickSpacing(2);
        speed.setMajorTickSpacing(1);
        speed.setPaintTicks(true);
        speed.setPaintLabels(true);


        this.add(speedLabel);
        this.add(speed);
        this.add(color);
    
    }
    
    public void setSpeed(int s) {

        speed.setValue(s);
    
    }
    
    public void changeColor() {
        
        int i = (int) (10 * Math.random());
        
        Color c = Color.red;
        
        switch(i) {
            
            case 0: c = Color.BLACK;
                break;
            case 1: c = Color.BLUE;
                break;
            case 2: c = Color.CYAN;
                break;
            case 3: c = Color.DARK_GRAY;
                break;
            case 4: c = Color.GREEN;
                break;
            case 5: c = Color.MAGENTA;
                break;
            case 6: c = Color.ORANGE;
                break;
            case 7: c = Color.PINK;
                break;
            case 8: c = Color.RED;
                break;
            case 9: c = Color.YELLOW;
                break;
            case 10: c = Color.LIGHT_GRAY;
                break;
            
        }
        
        color.setBackground(c);
    }

    
}
