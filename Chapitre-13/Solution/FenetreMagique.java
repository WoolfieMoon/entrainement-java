import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMagique extends JFrame {

    FenetreMagique() {
        this.setTitle("Grimoire Interactif");

        JButton button = new JButton("Lancer sort");
        button.addActionListener(e -> {
            System.out.println("Sort lancé !");
        });

        this.add(button);
    }

    public static void main(String[] args) {
        FenetreMagique frame = new FenetreMagique();
        frame.setVisible(true);
    }

}
