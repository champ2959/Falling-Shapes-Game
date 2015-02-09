/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author emg5478
 */
public class MyJPanel3 extends JPanel implements ActionListener {
    
    JButton b1, b2, b3, b4;
    JLabel paused;
    Timer tim;
    int i = 0;
    int delay = 10;
    int yJump = 5;
    
    public MyJPanel3() {
    
        super();
        
        setLayout(null);
        int limit = 0;
        
        this.setBackground(Color.WHITE);
        tim = new Timer(delay, this);
        
        b1 = new JButton("");
        b1.setBounds((int)(Math.random() * (400)), -60, 120, 60);

        
        b2 = new JButton("");
        b2.setText("");
        b2.setBounds((int) (Math.random() * 500), -150, 120, 60);
        
        b3 = new JButton("");
        b3.setBounds((int) (Math.random() * 600), -100, 120, 60);

        b4 = new JButton("");
        b4.setBounds((int) (Math.random() * 900), -200, 120, 60);
        
        paused = new JLabel("Click Start Game to Play");
        paused.setFont(new Font("Verdana", Font.BOLD, 24));
        paused.setBounds(new Rectangle(300, 0, 600, 600));
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(paused);
    }
    
    public void move() {
                
        int b1X = b1.getX();
        int b1Y =(b1.getY() + yJump);
        int b2X = b2.getX();
        int b2Y =(b2.getY() + yJump);
        int b3X = b3.getX();
        int b3Y =(b3.getY() + yJump);
        int b4X = b4.getX();
        int b4Y =(b4.getY() + yJump);
        
        int randomX = (int) (Math.random() * 10);
        int randomY = (int) (0 - (Math.random() * 5));
        
        if (b1Y > 720) {
            System.out.println(randomY);
            b1X = randomX * 98;
            b1Y = randomY * 100;
                 
        }
        if (b2Y > 704) {
             b2X = randomX * 94;
             b2Y = randomY * 90;
        }
        if (b3Y > 704) {
            b3X = randomX * 94;
            b3Y = randomY * 80;
        }
        if (b4Y > 704) {
            b4X = randomX * 92;
            b4Y = randomY * 60;
        }
        
        b1.setBounds(b1X, b1Y, 120, 50);
        b2.setBounds(b2X, b2Y, 120, 50);
        b3.setBounds(b3X, b3Y, 120, 50);
        b4.setBounds(b4X, b4Y, 120, 50);
            
    }
    public void changeBadButtons(Color badColor, String b) {
        
        Color c = badColor;
        
        for (i = 0; c.equals(badColor) == true; i++) {
            
            i = (int) (10 * Math.random());
        
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
        }
        
        if (b == "b2") {
            
            b2.setBackground(c);
            
        }
        else if (b == "b3") {
            
            b3.setBackground(c);
            
        }
        else if (b == "b4") {
            
            b4.setBackground(c);
            
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Object obj = e.getSource();
        
        
        
    
    
    }
}
