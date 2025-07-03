import javax.swing.*;

public class ChampDeSort extends JFrame {

    ChampDeSort() {
        JFrame frame = new JFrame("ChampDeSort");

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField field = new JTextField();
        panel.add(field);

        JLabel label = new JLabel();

        JButton button = new JButton("Lancer");
        button.addActionListener(e -> {
            field.getText();
            label.setText("Sort : " + field.getText());
        });

        panel.add(button);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ChampDeSort();
    }

}
