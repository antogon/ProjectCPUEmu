package projectcpuemu.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 * <p>Represents the main container for the views of this application.</p>
 * @author antoniomalvagomes
 */
public class MainWindow extends JFrame {

    public MainWindow()
    {
        super();
        this.setTitle("CPU Emulator");
        this.setLocation(400, 400);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Container mainContainer = this.getContentPane();
        mainContainer.setSize(this.getWidth(),this.getHeight());
        mainContainer.add(new CPUCanvas(this.getWidth()/4 * 3,this.getHeight()));
        mainContainer.add(new CPUInput(this.getWidth()/4,this.getHeight()), BorderLayout.EAST);
        this.setVisible(true);
    }
}
