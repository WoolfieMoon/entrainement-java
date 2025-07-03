import javax.swing.*;

public class PortailSecret extends JFrame {

    PortailSecret() {
        JFrame frame = new JFrame("Portail Secret");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        JLabel label = new JLabel();

        JButton button = new JButton("Ouvrir");
        button.addActionListener(e -> {
            if (passwordField.getText().equals("azk4lth")) {
                label.setText("✅ Portail ouvert.");
            } else  {
                label.setText("❌ Accès refusé.");
            }
        });

        panel.add(label);
        panel.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PortailSecret();
    }

}
