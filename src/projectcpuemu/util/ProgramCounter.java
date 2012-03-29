package projectcpuemu.util;

import java.util.ArrayList;
import projectcpuemu.gui.GUIListener;

/**
 * <p>A class representation of a program counter with program increment 
 * builtin.</p>
 * @author antoniomalvagomes
 */
public class ProgramCounter implements CComponent {
    private int myValue;
    private ArrayList<GUIListener> myListeners;
    
    public ProgramCounter()
    {
        myValue = 0;
        myListeners = new ArrayList<GUIListener>();
    }
    
    public int getValue()
    {
        return myValue;
    }
    
    public void increment()
    {
        myValue++;
    }

    @Override
    public void updateListeners()
    {
        for(GUIListener g : myListeners)
        {
            g.statusUpdated();
        }
    }
    
    @Override
    public void addListener(GUIListener g) {
        myListeners.add(g);
    }
}
