import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Loja extends JFrame implements ActionListener {
    private JTextField textFieldQuantidade1;
    private JTextField textFieldQuantidade2;
    private JTextField textFieldQuantidade3;
    private double precoProduto1 = 1.50;
    private double precoProduto2 = 5.00;
    private double precoProduto3 = 7.00;

    public Loja() {
        super("Cardápio de Doces");


        ImageIcon icon1 = new ImageIcon(getClass().getResource("brigadeiro.png"));
        JLabel imagemLabel1 = new JLabel(icon1);
        JLabel labelProduto1 = new JLabel("Brigadeiro");
        JLabel labelPreco1 = new JLabel("Preço: R$" + precoProduto1);
        JLabel labelQuantidade1 = new JLabel("Quantidade:");
        textFieldQuantidade1 = new JTextField(5);

        add(imagemLabel1);
        add(labelProduto1);
        add(labelPreco1);
        add(labelQuantidade1);
        add(textFieldQuantidade1);

        ImageIcon icon2 = new ImageIcon(getClass().getResource("cookie.jpg"));
        JLabel imagemLabel2 = new JLabel(icon2);
        JLabel labelProduto2 = new JLabel("Cookie");
        JLabel labelPreco2 = new JLabel("Preço: R$" + precoProduto2);
        JLabel labelQuantidade2 = new JLabel("Quantidade:");
        textFieldQuantidade2 = new JTextField(5);

        add(imagemLabel2);
        add(labelProduto2);
        add(labelPreco2);
        add(labelQuantidade2);
        add(textFieldQuantidade2);

        ImageIcon icon3 = new ImageIcon(getClass().getResource("pudim.jpg"));
        JLabel imagemLabel3 = new JLabel(icon3);
        JLabel labelProduto3 = new JLabel("Pudim");
        JLabel labelPreco3 = new JLabel("Preço: R$" + precoProduto3);
        JLabel labelQuantidade3 = new JLabel("Quantidade:");
        textFieldQuantidade3 = new JTextField(5);

        add(imagemLabel3);
        add(labelProduto3);
        add(labelPreco3);
        add(labelQuantidade3);
        add(textFieldQuantidade3);

        JButton botaoFinalizarCompra = new JButton("Finalizar Compra");
        botaoFinalizarCompra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int quantidade1 = Integer.parseInt(textFieldQuantidade1.getText());
                int quantidade2 = Integer.parseInt(textFieldQuantidade2.getText());
                int quantidade3 = Integer.parseInt(textFieldQuantidade3.getText());
                double total = quantidade1 * precoProduto1 + quantidade2 * precoProduto2 + quantidade3 * precoProduto3;
                JOptionPane.showMessageDialog(Loja.this, "Total da Compra: R$" + total);
            }
        });
        add(botaoFinalizarCompra);
    }

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.setResizable(false);
        loja.setLocationRelativeTo(null);
        loja.setSize(500, 500);
        loja.setVisible(true);
        loja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loja.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
