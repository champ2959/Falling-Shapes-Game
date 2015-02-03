/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author emg5478
 */
public class MyJPanel2 extends JPanel implements ActionListener {

    JSlider speed;
    JButton color;
    JLabel speedLabel;
    
    public MyJPanel2() {
        
        super();
        speed = new JSlider(JSlider.HORIZONTAL, 0, 2, 1);
        
        color = new JButton("Color");
        
        speedLabel = new JLabel("Speed: ");
        
        //Create the label table
        Hashtable labelTable = new Hashtable();
        labelTable.put(0, new JLabel("Slowest") );
        labelTable.put(1, new JLabel("Medium") );
        labelTable.put(2, new JLabel("Fast") );
        
        speed.setLabelTable(labelTable);
        speed.setMinorTickSpacing(2);
        speed.setMajorTickSpacing(1);
        speed.setPaintTicks(true);
        speed.setPaintLabels(true);


        this.add(speedLabel);
        this.add(speed);
        this.add(color);
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

       Object obj = e.getSource();
    
       if (obj == speed) {
           
           MyJPanel3 mjp3;
    
           
       }
    }
    
}
