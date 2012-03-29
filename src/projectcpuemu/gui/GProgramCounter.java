/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpuemu.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import projectcpuemu.util.ProgramCounter;

/**
 * <p>A graphical wrapper for the ProgramCounter utility</p>
 * @author antoniomalvagomes
 * @see projectcpuemu.util.ProgramCounter
 */
public class GProgramCounter extends JComponent implements GUIListener {
    
    private ProgramCounter myPC;
    private int myX, myY;
    
    public GProgramCounter(ProgramCounter pc, int x, int y)
    {
        myPC = pc;
        myX = x;
        myY = y;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font(Font.MONOSPACED,Font.PLAIN,14));
        g.drawString("PC", myX, myY);
        g.setColor(Color.green);
        g.drawRect(myX, myY+10, 60, 15);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        g.drawString(Integer.toBinaryString(myPC.getValue()), myX+3, myY+20);
    }

    @Override
    public void statusUpdated() {
        this.repaint();
    }
}
