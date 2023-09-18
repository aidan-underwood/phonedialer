import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * PhoneDialer class
 */
public class PhoneDialer implements ActionListener {
    private JFrame dialer;
    private JPanel contentPanel;
    private JPanel labelPanel;
    private JPanel buttonPanel;
    private JPanel numberPanel;
    private JLabel enterNumber;
    private JButton[] numberButtons;
    private JButton dashButton;
    private JButton dialButton;
    private String phoneNumber = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton sourceButton = (JButton) e.getSource();

        if (sourceButton.equals(dialButton)) {
            JOptionPane.showMessageDialog(dialer, "Phone number: " + phoneNumber);
        } else {
            String buttonText = sourceButton.getText();
            if (buttonText.matches("[0-9-]")) {
                phoneNumber += buttonText;
            }
        }
    }

    /**
     * PhoneDialer default constructor
     */
    public PhoneDialer() {
        dialer = new JFrame("Dialer");
        dialer.setSize(200, 250);

        dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPanel = (JPanel) dialer.getContentPane();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelPanel = new JPanel(new FlowLayout());
        enterNumber = new JLabel("Enter the number to dial:");

        labelPanel.add(enterNumber);

        buttonPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        numberButtons = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            numberButtons[i] = new JButton(Integer.toString(i));
            buttonPanel.add(numberButtons[i]);
        }

        dashButton = new JButton("-");
        buttonPanel.add(dashButton);

        contentPanel.add(labelPanel);
        contentPanel.add(buttonPanel);

        dialButton = new JButton("Dial Number");
        dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        contentPanel.add(dialButton);

        for (JButton button : numberButtons) {
            button.addActionListener(this);
        }

        dashButton.addActionListener(this);
        dialButton.addActionListener(this);

        dialer.setVisible(true);
    }
}
