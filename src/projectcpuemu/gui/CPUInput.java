/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpuemu.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

/**
 *
 * @author antoniomalvagomes
 */
public class CPUInput extends JPanel {
    
    private JTextArea myProgram;
    
    public CPUInput(int width, int height)
    {
        super();
        this.setSize(width, height);
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.setBackground(Color.decode("0xDDDDDD"));
        this.setLayout(new BorderLayout());
        JPanel buttonContainer = new JPanel();
        JLabel controlPanelName = new JLabel("Program Control: ");
        buttonContainer.setLayout(new FlowLayout(FlowLayout.LEADING));
        myProgram = new JTextArea(20,15);
        myProgram.setLineWrap(true);
        myProgram.setMaximumSize(new Dimension(this.getWidth(), this.getHeight()/2));
        JScrollPane scrollArea = new JScrollPane(myProgram);
        buttonContainer.setMinimumSize(new Dimension(this.getWidth(), this.getHeight()/2));
        buttonContainer.add(controlPanelName);
        this.add(buttonContainer, BorderLayout.NORTH);
        this.add(scrollArea,BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
