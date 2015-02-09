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
import javax.swing.border.LineBorder;
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
    boolean gameOver = false;
    
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
        mjp1.exit.addActionListener(this);
        
        mjp2.speed.addChangeListener(this);
        mjp2.color.addActionListener(this);
        
        mjp3.tim.addActionListener(this);
        mjp3.b1.addActionListener(this);
        mjp3.b2.addActionListener(this);
        mjp3.b3.addActionListener(this);
        mjp3.b4.addActionListener(this);
    }

    public String toString(int i) {
        
        String a = "";
        a += i;
        return a;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getSource();
        
        /**
         * If the score counter is over 10 or less that -1 and the object doesn't equal game start
         */
        
        if ((mjp2.scoreCount > 10 || mjp2.scoreCount < -1) && obj != mjp1.start) {
            
            gameOver = true;
            mjp3.tim.stop();
            gameStarted = false;
            mjp3.paused.setVisible(true);
            
           mjp3.b1.setVisible(gameStarted);
           mjp3.b2.setVisible(gameStarted);
           mjp3.b3.setVisible(gameStarted);
           mjp3.b4.setVisible(gameStarted); 
           
           if (mjp2.scoreCount > 10) {
               mjp3.paused.setText("You Won! ");
              
           
           }
           else {
                mjp3.paused.setText("Game Over! You Lost! Click start game to play again. ");
           }
        }
            
        
        /**
         * If you click the right button
         */
        if (obj == mjp3.b1) {

            /**
             * Add 1 to the score
             */
            mjp2.changeScore(1);
            
            /**
             * Change the buttons color
             */
            mjp2.changeColor();
            
            /**
             * Set the good buttons color
             */
            mjp3.b1.setBackground(mjp2.currentColor);
            
            
            /**
             * Change the Bad buttons to not be the new good buttons colors
             */
            mjp3.changeBadButtons(mjp2.currentColor, "b2");
            mjp3.changeBadButtons(mjp2.currentColor, "b3");
            mjp3.changeBadButtons(mjp2.currentColor, "b4");
            
        }
        else if (obj == mjp3.tim) {
            
            mjp3.i = mjp3.i + 1;
            
            /**
             * Move the buttons
             */
            mjp3.move();
            
            if (mjp3.b1.getY() > 700) {
                
                mjp2.changeColor();
                mjp3.b1.setBackground(mjp2.currentColor); 
            }
            if (mjp3.b2.getY() > 700) {
                mjp3.changeBadButtons(mjp2.currentColor, "b2");
               
            }
            if (mjp3.b3.getY() > 700) {
                
                mjp3.changeBadButtons(mjp2.currentColor, "b3");
               
            }
            if (mjp3.b4.getY() > 700) {
                
                mjp3.changeBadButtons(mjp2.currentColor, "b4");
  
            }
            
            
        }
        else if (obj == mjp3.b2 || obj == mjp3.b3 || obj == mjp3.b4) {
            
            mjp2.changeScore(-1);
            mjp2.changeColor();
            mjp3.changeBadButtons(mjp2.currentColor, "b2");
            mjp3.changeBadButtons(mjp2.currentColor, "b3");
            mjp3.changeBadButtons(mjp2.currentColor, "b4");
           
            
        }
        else if (obj == mjp1.start) {
            
            if (gameOver == true) {
            
                if (mjp2.scoreCount < 0) {
                    mjp2.changeScore(2);
                }
                else {
                    mjp2.changeScore(-11);
                }
               
                
 
                gameOver = false;
            }
            
            gameStarted = true;
            
            mjp3.b1.setVisible(gameStarted);
            mjp3.b2.setVisible(gameStarted);
            mjp3.b3.setVisible(gameStarted);
            mjp3.b4.setVisible(gameStarted); 
            mjp3.paused.setVisible(false);
            
            mjp2.changeColor();
            
            mjp3.b1.setBackground(mjp2.currentColor);
             mjp3.changeBadButtons(mjp2.currentColor, "b2");
            mjp3.changeBadButtons(mjp2.currentColor, "b3");
            mjp3.changeBadButtons(mjp2.currentColor, "b4");
            mjp3.tim.start();
        }
        else if (obj == mjp1.exit) {
            
            mjp3.tim.stop();
            gameStarted = false;
          
           mjp3.b1.setVisible(gameStarted);
           mjp3.b2.setVisible(gameStarted);
           mjp3.b3.setVisible(gameStarted);
           mjp3.b4.setVisible(gameStarted); 
           mjp3.paused.setText("Game Paused: \n Current Score: " + mjp2.scoreCount);
           mjp3.paused.setVisible(true);
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
          
               mjp3.tim.setDelay(10);
               mjp3.yJump = 3;
           }
           else if (newSpeed == 2) {

               mjp3.tim.setDelay(10);
               mjp3.yJump = 5;
            
           }
           else if (newSpeed == 3) {
              mjp3.tim.setDelay(10);
              mjp3.yJump = 6;
           }
           
           mjp3.tim.start();
        }
            
    }
    
}
