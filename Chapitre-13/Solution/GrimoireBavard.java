import javax.swing.*;

public class GrimoireBavard extends JFrame {

    GrimoireBavard() {
        JFrame frame = new JFrame("Grimoire Bavard");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("");

        JTextField field = new JTextField();
        panel.add(field);

        JButton button = new JButton("Parler");
        button.addActionListener(e -> {
            label.setText(field.getText().toUpperCase());
            field.setText("");
        });
        panel.add(button);
        panel.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GrimoireBavard();
    }

}
