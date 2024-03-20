import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame {

    JTextField campo_nome;
    JPasswordField campo_senha;
    JButton botao_finalizar;
    boolean confirmar = false;
    public Tela(){
        super("Tela de login");
        JPanel painel = new JPanel(null);

        ImageIcon icon = new ImageIcon(getClass().getResource("logo.png"));
        JLabel label = new JLabel(icon);
        label.setBounds(SwingConstants.CENTER+100,30,196,204);

        JLabel texto_nome = new JLabel("Nome");
        texto_nome.setBounds(175,255,60,30);

        campo_nome = new JTextField(21);
        campo_nome.setBounds(95,285,200,25);

        JLabel texto_senha = new JLabel("Senha");
        texto_senha.setBounds(175,320,60,30);

        campo_senha = new JPasswordField(21);
        campo_senha.setBounds(95,350,200,25);

        botao_finalizar = new JButton("Finalizar");
        botao_finalizar.setBounds(135,410,120,30);

        painel.add(label);
        painel.add(texto_nome);
        painel.add(campo_nome);
        painel.add(texto_senha);
        painel.add(campo_senha);
        painel.add(botao_finalizar);
        add(painel);

        buttonHandler handler = new buttonHandler();
        campo_nome.addActionListener(handler);
        campo_senha.addActionListener(handler);
        botao_finalizar.addActionListener(handler);
    }
    private class buttonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nome = "";
            String senha = "";
            if(e.getSource() == botao_finalizar) {
                nome = campo_nome.getText();
                senha = new String(campo_senha.getPassword());
                JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSenha: "+senha);
            }
        }
    }
}
