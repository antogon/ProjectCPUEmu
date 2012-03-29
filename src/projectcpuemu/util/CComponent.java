package projectcpuemu.util;

import projectcpuemu.gui.GUIListener;

/**
 * <p>An interface modeling all components of the computer.</p>
 * @author antoniomalvagomes
 */
public interface CComponent {
    public void addListener(GUIListener g);
    public void updateListeners();
}
