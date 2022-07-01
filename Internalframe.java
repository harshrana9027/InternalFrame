/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class Internalframe
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Select type");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JDesktopPane desktop = new JDesktopPane();
        //JPanel p = new JPanel();

        JButton b1 = new JButton("click me");
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JInternalFrame newWindow = new JInternalFrame(("user frame"), true, true, true, true);
               
                JButton b2 = new JButton("press");
                b2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e) 
                    {
                        JInternalFrame jin = new JInternalFrame(("admin frame"), true, true, true, true);
                        JButton b3=new JButton("submit");
                        
                        b3.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e)
                            {
                                JInternalFrame jn = new JInternalFrame(("local frame"), true, true, true, true);
                                JPanel p1=new JPanel();
                                jn.add(p1, BorderLayout.NORTH);
                                jn.setBackground( Color.gray);
                                p1.setBackground(Color.gray);
                               jn.setVisible(true);
                              jn.setSize(484,460);
                        
                              desktop.add(jn);
                                jn.moveToFront();
                                
                                
                            }
                            
                        });
                        
                        JPanel t1 = new JPanel();
                         t1.add(b3);
                         jin.add(t1, BorderLayout.NORTH);
                         jin.setBackground( Color.red);
                         t1.setBackground(Color.red);
                         jin.setVisible(true);
                         jin.setSize(484,460);
                        
                         desktop.add(jin);
                          jin.moveToFront();
                    }
                });
                
                
                JPanel t = new JPanel();
                t.add(b2);
                newWindow.add(t, BorderLayout.NORTH);
                newWindow.setVisible(true);
                newWindow.setSize(484, 460);
                desktop.add(newWindow);
                newWindow.moveToFront();
            }
        });
        
       // p.add(b1);
        f.add(b1);
        b1.setBounds(100,40,90,30);
       // f.add(BorderLayout.NORTH, p);
        f.add(BorderLayout.CENTER, desktop);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
}
