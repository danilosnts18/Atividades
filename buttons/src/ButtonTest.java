import javax.swing.*;

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(500, 120);
        buttonFrame.setVisible(true);
        buttonFrame.setResizable(false);
    }
}
