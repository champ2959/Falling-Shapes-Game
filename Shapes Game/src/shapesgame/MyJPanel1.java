/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author emg5478
 */
public class MyJPanel1 extends JPanel implements ActionListener {
    
    JButton start, exit;
    MyJPanel1 mjp1;
    MyJPanel2 mjp2;
    MyJPanel mjp;

    
    public MyJPanel1() {
        
        super();
        
        start = new JButton("Start Game");
        exit = new JButton("Exit Game");
        
        this.add(start);
        this.add(exit);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
            Object obj = e.getSource();
            
            if (obj == start) {
               
            }
            else if (obj == exit) {               
                
            }
    }
}
