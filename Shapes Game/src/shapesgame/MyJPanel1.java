/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
        
        Font f = new Font("Verdana", Font.PLAIN, 14);
        
        start = new JButton("Start Game");
        start.setSize(100, 20);
        start.setBackground(Color.GRAY);
        start.setBorder(new LineBorder(Color.GRAY, 10));
        start.setFont(f);
        start.setForeground(Color.WHITE);
        
        exit = new JButton("Pause Game");
        exit.setSize(100, 20);
        exit.setBackground(Color.GRAY);
        exit.setBorder(new LineBorder(Color.GRAY, 10));
        exit.setFont(f);
        exit.setForeground(Color.WHITE);
        
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
