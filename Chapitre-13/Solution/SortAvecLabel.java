import javax.swing.*;

public class SortAvecLabel extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("SortAvecLabel");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel();
        panel.add(label);
        JButton button = new JButton("Invoquer");

        button.addActionListener(e -> {
            label.setText("Invocation réussie !");
        });
        panel.add(button);

        frame.setSize(400,400);
        frame.setVisible(true);

    }

}
