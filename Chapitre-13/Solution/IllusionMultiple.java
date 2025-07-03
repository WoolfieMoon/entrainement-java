import javax.swing.*;

public class IllusionMultiple extends JFrame {

    IllusionMultiple() {
        JFrame frame = new JFrame("IllusionMultiple");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        String[] parameters = {"Mirage", "Fantôme", "Double magique"};

        JComboBox comboBox = new JComboBox(parameters);
        panel.add(comboBox);

        JLabel label = new JLabel("Illusion choisie : ");

        JButton button = new JButton("Projeter");
        button.addActionListener(e -> {
            label.setText("Illusion choisie : " + comboBox.getSelectedItem());
        });

        panel.add(button);
        panel.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new IllusionMultiple();
    }

}
