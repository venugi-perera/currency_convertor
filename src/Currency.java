import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Currency extends JFrame {
    private JPanel panel1;
    private JTextField txtfrom;
    private JTextField txtamount;
    private JButton convertButton;
    private JComboBox txtto;

    public Currency() {

        convertButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */

            public void actionPerformed(ActionEvent e) {

                double tot;
                double amount = Double.parseDouble(txtamount.getText());

                if (txtfrom.getText() == "USD" && txtto.getSelectedItem().toString() == "Srilankan Rupees") {
                    tot = amount * 179.50;
                    JOptionPane.showMessageDialog(panel1, "Your Amount will be " + tot);
                } else if (txtfrom.getText() == "USD" && txtto.getSelectedItem().toString() == "Indian Rupees") {
                    tot = amount * 70.50;
                    JOptionPane.showMessageDialog(panel1, "Your Amount will be " + tot);
                }
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        Currency currency = new Currency();
        currency.setContentPane(new Currency().panel1);
        currency.setDefaultCloseOperation(EXIT_ON_CLOSE);
        currency.setVisible(true);
        currency.pack();
    }
}
