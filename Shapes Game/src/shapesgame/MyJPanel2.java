/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        speed = new JSlider();
        
        color = new JButton("Color");
        
        speedLabel = new JLabel("Speed: ");
        
        this.add(speedLabel);
        this.add(speed);
        this.add(color);
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
