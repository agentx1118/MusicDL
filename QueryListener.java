/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiclass;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Sean
 */
public class QueryListener implements ActionListener{
    private JLabel label;
    private String text;
    
    public QueryListener(JLabel initLabel)
    {
        label = initLabel;
        text = "";
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    
}
