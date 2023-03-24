import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingActionExample extends JFrame implements ActionListener {
    private TextField txt;
    private JButton but1;
    private JButton but2;

    public SwingActionExample(){
        setBounds(400,400,150,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

       //setTitle("Счетчик");
       //setVisible(true);

       Label label = new Label("Число:");
       add(label);

        txt = new TextField("0");
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("+1");
        but2 = new JButton("-1");

        but1.addActionListener(this);
        but2.addActionListener(this);

        add(but1);
        add(but2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getActionCommand().equals("+1")){
            int num1, num2;
            num1 = Integer.parseInt(txt.getText());
            if (num1<3){
                num2 = num1 + 1;
                txt.setText(String.valueOf(num2));
            }
            else {
                txt.setText(String.valueOf(num1));
            }
        }
        else if(a.getActionCommand().equals("-1")){
            int num1, num2;
            num1 = Integer.parseInt(txt.getText());
            if (num1>-5){
                num2 = num1 - 1;
                txt.setText(String.valueOf(num2));
            }
            else {
                txt.setText(String.valueOf(num1));
            }
        }
    }

    public static void main(String[] args) {
        new SwingActionExample();
    }
}
