
import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JPanel;

public class Frame extends JFrame implements KeyListener {
    private JLabel label;
    private JPanel panel;
    public Frame(String s)
    {
        super(s);
        panel = new JPanel();
        label = new JLabel("Key Listener!");
        panel.add(label);
        add(panel);
        addKeyListener(this);
        setSize(200, 100);
        setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key pressed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key pressed");
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
