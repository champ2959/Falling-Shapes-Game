/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author emg5478
 */
public class MyJPanel extends JPanel {
    
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
            
        
        
    }
    
}
