package projectcpuemu.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import projectcpuemu.util.InstructionRegister;

/**
 *
 * @author antoniomalvagomes
 */
public class GInstructionRegister extends JComponent implements GUIListener {
    
    private int myX, myY;
    private InstructionRegister myIR;
    
    public GInstructionRegister(InstructionRegister r, int x, int y)
    {
        myX = x;
        myY = y;
        myIR = r;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font(Font.MONOSPACED,Font.PLAIN,14));
        g.drawString("IR", myX, myY);
        g.setColor(Color.green);
        g.drawRect(myX, myY+10, 60, 15);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        g.drawString(Integer.toBinaryString(myIR.getCode()) + " : " + myIR.getInstruction(), myX+3, myY+20);
    }

    @Override
    public void statusUpdated() {
        this.repaint();
    }
    
}
