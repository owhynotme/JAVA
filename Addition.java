import javax.swing.*;
import java.awt.event.*;
// import java.awt.FlowLayout;

// class Addition extends JFrame implements ActionListener {
class Addition extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Addition of 2 Numbers");
    JLabel l2 = new JLabel("Number 1");
    JLabel l3 = new JLabel("Number 2");
    JLabel l4 = new JLabel("Answer");

    JButton b = new JButton("ADD");

    JTextField t1 = new JTextField(8);
    JTextField t2 = new JTextField(8);
    JTextField t3 = new JTextField(8);

    public Addition() {

        l1.setBounds(70, 20, 200, 30);

        l2.setBounds(60, 90, 100, 30);
        t1.setBounds(160, 90, 100, 30);

        l3.setBounds(60, 130, 100, 30);
        t2.setBounds(160, 130, 100, 30);

        b.setBounds(90, 180, 100, 30);

        l4.setBounds(100, 250, 100, 30);
        t3.setBounds(180, 250, 100, 30);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b);
        add(l4);
        add(t3);

        b.addActionListener(this);

        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            t3.setText(" " + (a + b));
        }
    }

    public static void main(String a[])
    {
        Addition abj=new Addition();
    }

}
