import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pext extends JFrame implements ActionListener {
//    public static void main(String[] args) {

//        JLabel label=new JLabel();
//        label.setText("haoudfha");
//        label.setBounds(100,100,500,500);

//        JTextField usrId=new JTextField();
//        usrId.getText();
//        usrId.setBounds(400,300,50,50);
//        usrId.setVisible(true);
//        usrId.setPreferredSize(new Dimension(250,400));


//        JFrame frame=new JFrame();
       pext(){

           JTextField usr=new JTextField();
           usr.setPreferredSize(new Dimension(40,50));

            this.setVisible(true);
            this.setSize(750,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        this.add(label);
            this.setTitle("Online Examination Portal");
            this.add(this);
            this.add(usr);
            this.pack();
        }
//    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}