/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcpuemu.util;

import java.util.ArrayList;
import projectcpuemu.gui.GUIListener;

/**
 *
 * @author antoniomalvagomes
 */
public class InstructionRegister implements CComponent {
    
    private int myCode;
    private String myInstruction;
    private ArrayList<GUIListener> myListeners;

    public InstructionRegister()
    {
        myCode = 0;
        myInstruction = "null";
        myListeners = new ArrayList<GUIListener>();
    }
    
    public int getCode()
    {
        return myCode;
    }
    
    public String getInstruction()
    {
        return myInstruction;
    }
    
    public void process(int code)
    {
        myCode = code;
        //Some microcode shit here probably
        this.updateListeners();
    }
    
    @Override
    public void addListener(GUIListener g) {
        myListeners.add(g);
    }

    @Override
    public void updateListeners() {
        for(GUIListener g : myListeners)
        {
            g.statusUpdated();
        }
    }
    
}
