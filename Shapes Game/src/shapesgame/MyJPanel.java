/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author emg5478
 */
public class MyJPanel extends JPanel implements ActionListener, ChangeListener {
    
    MyJPanel1 mjp1;
    MyJPanel2 mjp2;
    MyJPanel3 mjp3;
    
    public MyJPanel() {
        
        super();
        
        setLayout(new BorderLayout());
        
        mjp1 = new MyJPanel1();
        mjp2 = new MyJPanel2();
        mjp3 = new MyJPanel3();
        
        
        this.add(mjp1, "North");
        
        this.add(mjp2, "South");
        
        mjp1.start.addActionListener(this);
        
        mjp2.speed.addChangeListener(this);
        mjp2.color.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getSource();
        if (obj == mjp1.start) {
            
            mjp2.changeColor();
        }
         if (obj == mjp2.color) {
            
           mjp2.changeColor();
            
        }
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        Object obj = e.getSource();
        
        if (obj == mjp2.speed && !mjp2.speed.getValueIsAdjusting()) {
            
           int newSpeed = mjp2.speed.getValue();
           
           mjp2.setSpeed(newSpeed);
            
        }
    
    }
    
}
