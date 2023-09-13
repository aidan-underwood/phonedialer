import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class Main {
    public static void main(String[] args) {

    }
}


class PhoneDialer {
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonDash = new JButton("-");
    JButton buttonDial = new JButton("Dial Number");
    String phoneNumber = "";

    public PhoneDialer() {
        JFrame dialer = new JFrame("Dialer");
        dialer.setSize(200, 250);
        dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel numberPanel = (JPanel) dialer.getContentPane();
        numberPanel.setLayout(new BoxLayout(numberPanel, 0));
        Border dialerBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        numberPanel.setBorder(dialerBorder);
        JPanel topLabel = (JPanel) dialer.getContentPane();
        topLabel.setLayout(new FlowLayout());
        topLabel.add(new JLabel("Enter the number to dial:"));
    }
}
