/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;

/**
 *
 * @author Sean
 */
public class SetListener implements KeyListener{
    private JLabel label;
    private String text;
    
    public SetListener(JLabel initLabel)
    {
        label = initLabel;
        text = "";
        init();
    }
    
    public void init()
    {
        label.addKeyListener(this);
    }
    
    @Override
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println("1" + e.getKeyChar());
        if(e.getKeyCode() == KeyEvent.VK_ENTER);
        {
            //Implementation for music download here
        }
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        text += e.getKeyChar();
    }
}
