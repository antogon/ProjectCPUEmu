package projectcpuemu.gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>Represents the main container for the views of this application.</p>
 * @author antoniomalvagomes
 */
public class MainWindow extends JFrame {

    public MainWindow()
    {
        super();
        JPanel mainContainer = new JPanel();
        JPanel canvasContainer = new JPanel();
        JPanel inputContainer = new JPanel();
        canvasContainer.setSize(399, 580);
        inputContainer.setSize(399, 580);
        canvasContainer.setBackground(Color.decode("0xDDDDDD"));
        inputContainer.setBackground(Color.decode("0xFFFFFF"));
        mainContainer.add(canvasContainer);
        mainContainer.add(inputContainer);
        this.setContentPane(mainContainer);
        this.setLocation(400, 400);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setVisible(true);
    }
}
