/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Sean
 */
public class GUIClass implements KeyListener{
    private String text;
    
    private void initFrame()
    {
        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Huston Family Music Database");
        guiFrame.add(mainPanel());
        guiFrame.addKeyListener(this);
        guiFrame.pack();
        guiFrame.setVisible(true);
    }
    
    //Primary panel
    private JPanel mainPanel()
    {
        JPanel guiPanel = new JPanel();
        guiPanel.add(scrollbar());
        guiPanel.add(querySetPanel());
        return(guiPanel);
    }
    
    private JPanel blankPanel(int h, int w)
    {
        JPanel blank = new JPanel();
        blank.setPreferredSize(new Dimension(h,w));
        return(blank);
    }
    
    private JPanel textPanel(int h, int w, String text)
    {
        JPanel textPanel = blankPanel(h,w);
        textPanel.add(textLabel(text));
        return(textPanel);
    }
    
    private JLabel textLabel(String text)
    {
        JLabel label = new JLabel(text);
        return(label);
    }
    
    //Table panel
    private JScrollPane scrollbar()
    {
        JScrollPane scrollbar = new JScrollPane(table(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollbar.setPreferredSize(new Dimension(500,450));
        return(scrollbar);
    }
    
    private JPanel table()
    {
        JPanel tablePanel = new JPanel();
        //tablePanel.setPreferredSize(new Dimension(500, 450));
        return(tablePanel);
    }
    
    //Query and set panel
    private JPanel querySetPanel()
    {
        JPanel querySetPanel = new JPanel();
        BoxLayout box = new BoxLayout(querySetPanel,BoxLayout.Y_AXIS);
        querySetPanel.setLayout(box);
        querySetPanel.setPreferredSize(new Dimension(200,450));
        querySetPanel.add(blankPanel(150,25));
        querySetPanel.add((textPanel(150,25,"Search:")));
        querySetPanel.add(queryField());
        querySetPanel.add(blankPanel(150,300));
        querySetPanel.add(textPanel(150,25,"Enter a playlist link: "));
        querySetPanel.add(setField());
        querySetPanel.add(blankPanel(150,50));
        return(querySetPanel);
    }
    
    private JTextField queryField()
    {
        JTextField queryField = new JTextField();
        queryField.setMaximumSize(new Dimension(175,25));
        return(queryField);
    }
    
    private JTextField setField()
    {
        JTextField setField = new JTextField();
        setField.setMaximumSize(new Dimension(175,25));
        return(setField);
    }
    
    public GUIClass()
    {        
        initFrame();
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
        System.out.println("1" + e.getKeyChar());
        text += e.getKeyChar();
    }
}
