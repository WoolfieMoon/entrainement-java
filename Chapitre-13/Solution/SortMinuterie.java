import javax.swing.*;

public class SortMinuterie extends JFrame {

    SortMinuterie() {
        JFrame frame = new JFrame("SortMinuterie");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("");
        panel.add(label);

        JButton button = new JButton("Préparer sort");
        button.addActionListener(e -> {
            label.setText("Préparation...");
            new Timer(2000, e1 -> {
                label.setText("\uD83D\uDCA5 Sort lancé !");
            }).start();
        });

        panel.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SortMinuterie();
    }

}
