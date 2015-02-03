/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import javax.swing.JFrame;

/**
 *
 * @author emg5478
 */
public class MyJFrame extends JFrame {
    
    MyJPanel mjp;
    
    public MyJFrame() {
    
        super("Falling Shapes Game");
       
        mjp = new MyJPanel();
    
        this.getContentPane().add(mjp, "Center");
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize (1000, 800);
        this.setVisible(true);
        
        
    }
    
}
