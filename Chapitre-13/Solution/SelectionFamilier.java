import javax.swing.*;

public class SelectionFamilier extends JFrame {

    SelectionFamilier() {

        JFrame frame = new JFrame("Selection Familier");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("");

        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Chouette", "Dragonnet", "Chat noir"});
        comboBox.addActionListener(e -> {
            label.setText("Familier sélectionné : " + comboBox.getSelectedItem().toString());
        });
        panel.add(comboBox);
        panel.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SelectionFamilier();
    }

}
