import javax.swing.*;
import java.awt.*;

public class GrimoireInteractif extends JFrame {

    GrimoireInteractif() {

        JFrame frame = new JFrame("Grimoire Interactif");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout()); // Centre le panel

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Empile verticalement
        frame.add(panel, new GridBagConstraints());

        JLabel label = new JLabel();
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField sortField = new JTextField(3);
        sortField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(sortField);

        JButton button = new JButton("Lancer le sort");
        button.addActionListener(e -> {
            if(sortField.getText().equals("")) {
                label.setText("⚠️ Aucun sort saisi.");
            } else {
                label.setText("✨ Sort " + sortField.getText() + " lancé !");
            }
        });
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(label);
        panel.add(button);

        JComboBox<String> themes =  new JComboBox<>(new String[]{"Clair", "Sombre", "Mystique"});
        themes.addActionListener(e -> {
            switch (themes.getSelectedItem().toString()) {
                case "Clair":
                    panel.setBackground(Color.WHITE);
                    break;

                case "Sombre":
                    panel.setBackground(Color.DARK_GRAY);
                    break;

                case "Mystique":
                    panel.setBackground(Color.MAGENTA);
                    break;
                default :
                    panel.setBackground(Color.CYAN);
                    break;
            }
        });
        themes.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(themes);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GrimoireInteractif();
    }

}
