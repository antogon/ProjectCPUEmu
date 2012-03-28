/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpuemu.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author antoniomalvagomes
 */
public class CPUCanvas extends JPanel {
    
    public CPUCanvas(int width, int height)
    {
        super();
        this.setSize(width, height);
        this.setBackground(Color.decode("0xFFFFDD"));
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }
    
}
