/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpuemu.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;
import projectcpuemu.util.InstructionRegister;
import projectcpuemu.util.ProgramCounter;

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
        this.setLayout(null);
        
        ProgramCounter pc = new ProgramCounter();
        GProgramCounter gpc = new GProgramCounter(pc, 10, 10);
        gpc.setBounds(new Rectangle(10,10,100,50));
        this.add(gpc);
        
        InstructionRegister ir = new InstructionRegister();
        GInstructionRegister gir = new GInstructionRegister(ir, 50, 50);
        gir.setBounds(new Rectangle(50,50,200,200));
        this.add(gir);
        this.setVisible(true);
    }
    
}
