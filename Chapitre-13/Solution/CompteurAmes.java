import javax.swing.*;

public class CompteurAmes {
    private int compteur = 0;

    public CompteurAmes() {
        JFrame frame = new JFrame("CompteurAmes");
        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Âmes capturées : " + compteur);
        panel.add(label);

        JButton button = new JButton("Capturer");
        button.addActionListener(e -> {
            compteur++;
            label.setText("Âmes capturées : " + compteur);
        });
        panel.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CompteurAmes();
    }
}