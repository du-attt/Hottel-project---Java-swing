/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author admin
 */
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Thêm");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showCustomDialog(frame);
            }
        });

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }

    private static void showCustomDialog(JFrame parentFrame) {
        final JDialog dialog = new JDialog(parentFrame, "Dialog", true);

        JLabel label = new JLabel("Nội dung dialog");
        dialog.getContentPane().add(label);

        JButton closeButton = new JButton("Đóng");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
        dialog.getContentPane().add(closeButton);

        dialog.pack();
        dialog.setVisible(true);
    }
}
