import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class SortApparence extends JFrame {

    public SortApparence() {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton rouge = new JButton("Rouge");
        rouge.addActionListener(e -> {
            panel.setBackground(new Color(255, 0, 0));
        });
        panel.add(rouge);

        JButton bleu = new JButton("Bleu");
        bleu.addActionListener(e -> {
            panel.setBackground(new Color(0, 0, 255));
        });
        panel.add(bleu);

        JButton vert = new JButton("Vert");
        vert.addActionListener(e -> {
            panel.setBackground(new Color(0, 255, 0));
        });
        panel.add(vert);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SortApparence();
    }
}
