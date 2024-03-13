import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonFrame extends JFrame {
    private JButton plainJButton;
    private JButton fancyJButton;

    private JButton fancyJButton2;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon alvo1 = new ImageIcon(getClass().getResource("alvo.png"));
        Icon alvo2 = new ImageIcon(getClass().getResource("alvo.png"));
        fancyJButton = new JButton("FancyButton", alvo1);
        fancyJButton.setRolloverIcon(alvo2);
        add(fancyJButton);

        Icon flecha1 = new ImageIcon(getClass().getResource("flecha.png"));
        Icon flecha2 = new ImageIcon(getClass().getResource("flecha.png"));
        fancyJButton2 = new JButton("OutroButton", flecha1);
        fancyJButton2.setRolloverIcon(flecha2);
        add(fancyJButton2);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
        fancyJButton2.addActionListener(handler);


    }
    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent event){
             JOptionPane.showMessageDialog(ButtonFrame.this, String.format ("You pressed: %s", event.getActionCommand()));
        }
    }
}