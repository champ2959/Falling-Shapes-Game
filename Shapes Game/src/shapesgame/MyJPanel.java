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
    boolean gameStarted = false;
    
    public MyJPanel() {
        
        super();
        
        setLayout(new BorderLayout());
        
        mjp1 = new MyJPanel1();
        mjp2 = new MyJPanel2();
        mjp3 = new MyJPanel3();
        
        
        this.add(mjp1, "North");
        this.add(mjp3, "Center");
        this.add(mjp2, "South");
        
        mjp1.start.addActionListener(this);
        
        mjp2.speed.addChangeListener(this);
        mjp2.color.addActionListener(this);
        
        mjp3.tim.addActionListener(this);
        
        
    }

    public String toString(int i) {
        
        String a = "";
        a += i;
        return a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getSource();
        if (obj == mjp1.start) {
            
            gameStarted = true;
            mjp2.changeColor();
            mjp3.tim.start();
        }
        else if (obj == mjp2.color) {
            
           mjp2.changeColor();
            
        }
        else if (obj == mjp3.tim) {
            
            mjp3.i = mjp3.i + 1;
                      
            mjp3.b1.setText( this.toString(mjp3.i));
            
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        Object obj = e.getSource();
        
        if (obj == mjp2.speed && !mjp2.speed.getValueIsAdjusting() && gameStarted == true) {
            
           int newSpeed = mjp2.speed.getValue();
           
           mjp2.setSpeed(newSpeed);
           
           mjp3.tim.stop();
           if (newSpeed == 1) {
               mjp3.tim.setDelay(1000);
           }
           else if (newSpeed == 2) {

               mjp3.tim.setDelay(600);
            
           }
           else if (newSpeed == 3) {
              mjp3.tim.setDelay(300);
           }
           
           mjp3.tim.start();
        }
    
    }
    
}
