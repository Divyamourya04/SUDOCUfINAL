import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import java.util.Objects;

public class Sudocu_test extends JDialog {
    private JPanel contentPane;
    private JButton rest;
    private JButton val1;
    private JButton val2;
    private JButton val3;
    private JButton val4;
    private JButton val5;
    private JButton val6;
    private JButton val7;
    private JButton val8;
    private JButton val9;
    private JButton showsol;
    private JButton chkm;
    private JButton ext;
    private JButton r1c1;
    private JButton r1c3;
    private JButton r1c2;
    private JButton r3c1;
    private JButton r3c2;
    private JButton r3c3;
    private JButton r2c1;
    private JButton r2c2;
    private JButton r2c3;
    private JButton r1c4;
    private JButton r1c6;
    private JButton r1c5;
    private JButton r3c6;
    private JButton r3c5;
    private JButton r3c4;
    private JButton r2c4;
    private JButton r2c5;
    private JButton r2c6;
    private JButton r1c7;
    private JButton r1c9;
    private JButton r1c8;
    private JButton r3c9;
    private JButton r2c9;
    private JButton r2c7;
    private JButton r3c7;
    private JButton r2c8;
    private JButton r3c8;
    private JButton r4c9;
    private JButton r4c7;
    private JButton r4c8;
    private JButton r6c8;
    private JButton r6c9;
    private JButton r5c9;
    private JButton r5c8;
    private JButton r5c7;
    private JButton r6c7;
    private JButton r9c7;
    private JButton r9c9;
    private JButton r9c8;
    private JButton r7c7;
    private JButton r7c8;
    private JButton r7c9;
    private JButton r8c9;
    private JButton r8c8;
    private JButton r8c7;
    private JButton r4c6;
    private JButton r4c4;
    private JButton r4c5;
    private JButton r6c6;
    private JButton r5c6;
    private JButton r5c5;
    private JButton r6c5;
    private JButton r5c4;
    private JButton r6c4;
    private JButton r4c3;
    private JButton r4c1;
    private JButton r4c2;
    private JButton r6c3;
    private JButton r5c3;
    private JButton r5c2;
    private JButton r6c2;
    private JButton r5c1;
    private JButton r6c1;
    private JButton r7c6;
    private JButton r7c4;
    private JButton r7c5;
    private JButton r9c6;
    private JButton r8c6;
    private JButton r8c5;
    private JButton r9c5;
    private JButton r8c4;
    private JButton r9c4;
    private JButton r7c3;
    private JButton r7c1;
    private JButton r7c2;
    private JButton r9c3;
    private JButton r8c3;
    private JButton r8c2;
    private JButton r9c2;
    private JButton r8c1;
    private JButton r9c1;
    private JButton EXIT;
    private String globle="0";
    private String solvedBoard [][]={
            {"2","9","8","5","1","6","7","3","4"},
            {"4","1","3","2","7","8","5","6","9"},
            {"7","5","6","3","4","9","1","2","8"},
            {"8","2","1","4","3","5","6","9","7"},
            {"5","3","4","6","9","7","2","8","1"},
            {"9","6","7","1","8","2","3","4","5"},
            {"1","4","2","8","5","3","9","7","6"},
            {"3","7","5","9","6","4","8","1","2"},
            {"6","8","9","7","2","1","4","5","3"}

    };

    private JButton Butns [][]={
            {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9}
    };
    private JButton preDefButtons[]={
            r2c1,r3c1,r3c3,r1c4,r2c5,r2c6,r3c5,r1c7,r1c8,r1c9,r2c7,r2c9,r3c8,  r5c2,r5c3,r6c2,r4c5,r4c6,r6c4,r6c5,
            r4c8,r5c8,r5c7,r7c2,r8c1,r9c1,r9c2,r9c3,r7c5,r8c5,r9c6,r8c4,r7c7,r7c9,r8c9
    };
    public Sudocu_test() {
       // rest = new JButton();

        setContentPane(contentPane);
        setModal(true);
        //getRootPane().setDefaultButton(EXIT);


        ext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(e.paramString());
               if (e.getActionCommand()=="EXIT"){
                   //System.out.println(e.getSource().toString());
                   //System.out.println(e.getSource().toString().length());
                   //System.out.println(e.getSource().toString().indexOf("EXIT"));
                   //Object obj = e.getSource();
                  // r1c1.setText("1");
                   //r1c1.setBackground(Color.pink);
                  // obj.toString().replaceAll("EXIT","OK");
                   //System.out.println(obj.toString());
                  // e.setSource(obj);
                   //System.out.println(e.getSource().toString());



                   System.exit(0);
               }
            }
        });
        val1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(globle != "1"){
                globle= "1";
                val2.setBackground(val1.getBackground());
                val3.setBackground(val1.getBackground());
                val4.setBackground(val1.getBackground());
                val5.setBackground(val1.getBackground());
                val6.setBackground(val1.getBackground());
                val7.setBackground(val1.getBackground());
                val8.setBackground(val1.getBackground());
                val9.setBackground(val1.getBackground());
               val1.setBackground(Color.WHITE);
            }else {
                val1.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        val2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(globle != "2"){
                globle= "2";
                val1.setBackground(val2.getBackground());
                val3.setBackground(val2.getBackground());
                val4.setBackground(val2.getBackground());
                val5.setBackground(val2.getBackground());
                val6.setBackground(val2.getBackground());
                val7.setBackground(val2.getBackground());
                val8.setBackground(val2.getBackground());
                val9.setBackground(val2.getBackground());
                val2.setBackground(Color.WHITE);
            }else {
                val2.setBackground(val9.getBackground());
                globle="0";
            }
                //System.out.println(globle);
            }

        });
        // val3 listenr
        val3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(globle != "3"){
                globle= "3";
                val1.setBackground(val3.getBackground());
                val2.setBackground(val3.getBackground());
                val4.setBackground(val3.getBackground());
                val5.setBackground(val3.getBackground());
                val6.setBackground(val3.getBackground());
                val7.setBackground(val3.getBackground());
                val8.setBackground(val3.getBackground());
                val9.setBackground(val3.getBackground());
                val3.setBackground(Color.WHITE);
            }else {
                val3.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //Val3 lister end

        //Val4 start
        val4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle!="4"){
                globle= "4";
                val1.setBackground(val4.getBackground());
                val2.setBackground(val4.getBackground());
                val3.setBackground(val4.getBackground());
                val5.setBackground(val4.getBackground());
                val6.setBackground(val4.getBackground());
                val7.setBackground(val4.getBackground());
                val8.setBackground(val4.getBackground());
                val9.setBackground(val4.getBackground());
                val4.setBackground(Color.WHITE);
            }else {
                val4.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //Val4 end
        // val5 start
        val5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle!="5") {
                globle= "5";
                val1.setBackground(val5.getBackground());
                val2.setBackground(val5.getBackground());
                val3.setBackground(val5.getBackground());
                val4.setBackground(val5.getBackground());
                val6.setBackground(val5.getBackground());
                val7.setBackground(val5.getBackground());
                val8.setBackground(val5.getBackground());
                val9.setBackground(val5.getBackground());
                val5.setBackground(Color.WHITE);
            }else {
                val5.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //val5 end
        //val6 start
        val6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle!="6") {
                globle= "6";
                val1.setBackground(val6.getBackground());
                val2.setBackground(val6.getBackground());
                val3.setBackground(val6.getBackground());
                val4.setBackground(val6.getBackground());
                val5.setBackground(val6.getBackground());
                val7.setBackground(val6.getBackground());
                val8.setBackground(val6.getBackground());
                val9.setBackground(val6.getBackground());
                val6.setBackground(Color.WHITE);
            }else {
                val6.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //val6 end
        //val7 start
        val7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle!="7") {
                globle= "7";
                val1.setBackground(val7.getBackground());
                val2.setBackground(val7.getBackground());
                val3.setBackground(val7.getBackground());
                val4.setBackground(val7.getBackground());
                val5.setBackground(val7.getBackground());
                val6.setBackground(val7.getBackground());
                val8.setBackground(val7.getBackground());
                val9.setBackground(val7.getBackground());
                val7.setBackground(Color.WHITE);
            }else {
                val7.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //val7 end
        //val8 start
        val8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle!="8") {
                    globle= "8";
                val1.setBackground(val8.getBackground());
                val2.setBackground(val8.getBackground());
                val3.setBackground(val8.getBackground());
                val4.setBackground(val8.getBackground());
                val5.setBackground(val8.getBackground());
                val6.setBackground(val8.getBackground());
                val7.setBackground(val8.getBackground());
                val9.setBackground(val8.getBackground());
                val8.setBackground(Color.WHITE);
            }else {
                val8.setBackground(val9.getBackground());
                globle="0";
            }
            }
        });
        //val8 end
        //val9 start
        val9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(globle!="9") {
                    globle= "9";
                    val1.setBackground(val9.getBackground());
                    val2.setBackground(val9.getBackground());
                    val3.setBackground(val9.getBackground());
                    val4.setBackground(val9.getBackground());
                    val5.setBackground(val9.getBackground());
                    val6.setBackground(val9.getBackground());
                    val7.setBackground(val9.getBackground());
                    val8.setBackground(val9.getBackground());
                    val9.setBackground(Color.WHITE);
                }else {
                    val9.setBackground(val8.getBackground());
                    globle="0";
                }
            }
        });
        //val9 end

//r1c1  start
        r1c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r1c1.setText(globle);
                    r1c1.setBackground(Color.WHITE);
                }
            }
        });

     //r1c1 end

       //r1c2 start
        r1c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r1c2.setText(globle);
                    r1c2.setBackground(Color.WHITE);
                }
            }
        });
        //r1c2 end
        //r1c3 start
        r1c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r1c3.setText(globle);
                    r1c3.setBackground(Color.WHITE);
                }
            }
        });
        //r1c3 End
        //r1c4 start
        r1c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r1c4.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*if(globle !="0") {
                    r1c4.setText(globle);
                    r1c4.setBackground(Color.WHITE);
                }*/
            }
        });
        //r1c4 End
        //r1c5 start
        r1c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r1c5.setText(globle);
                    r1c5.setBackground(Color.WHITE);
                }
            }
        });
        //r1c5 End
        //r1c6 start
        r1c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r1c6.setText(globle);
                    r1c6.setBackground(Color.WHITE);
                }
            }
        });
        //r1c6 End
        //r1c7 start
        r1c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r1c7.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*if(globle !="0") {
                    r1c7.setText(globle);
                    r1c7.setBackground(Color.WHITE);
                }*/
            }
        });
        //r1c7 End
        //r1c8 start
        r1c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r1c8.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*if(globle !="0") {
                    r1c8.setText(globle);
                    r1c8.setBackground(Color.WHITE);
                }*/
            }
        });
        //r1c8 End
        //r1c9 start
        r1c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r1c9.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

              /*  if(globle !="0") {
                    r1c9.setText(globle);
                    r1c9.setBackground(Color.WHITE);
                }*/
            }
        });
        //r1c9 End
        //r2c1 start
        r2c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r2c1.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*if(globle !="0") {
                    r2c1.setText(globle);
                    r2c1.setBackground(Color.WHITE);
                }*/
            }
        });
        //r2c1 End
        //r2c2 start
        r2c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r2c2.setText(globle);
                    r2c2.setBackground(Color.WHITE);
                }
            }
        });
        //r2c2 End
        //r2c3 start
        r2c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r2c3.setText(globle);
                    r2c3.setBackground(Color.WHITE);
                }
            }
        });
        //r2c3 End
        //r2c4 start
        r2c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showConfirmDialog(r1c4.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

               if(globle !="0") {
                    r2c4.setText(globle);
                    r2c4.setBackground(Color.WHITE);
                }
            }
        });
        //r2c4 End
        //r2c5 start
        r2c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              /*  if(globle !="0") {
                    r2c5.setText(globle);
                    r2c5.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r2c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r2c5 End
        //r2c6 start
        r2c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r2c6.setText(globle);
                    r2c6.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r2c6.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r2c6 End
        //r2c7 start
        r2c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                if(globle !="0") {
                    r2c7.setText(globle);
                    r2c7.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r2c7.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r2c7 End
        //r2c8 start
        r2c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r2c8.setText(globle);
                    r2c8.setBackground(Color.WHITE);
                }
            }
        });
        //r2c8 End
        //r2c9 start
        r2c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                if(globle !="0") {
                    r2c9.setText(globle);
                    r2c9.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r2c9.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r2c9 End
        //r3c1 start
        r3c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r3c1.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

           /*     if(globle !="0") {
                    r3c1.setText(globle);
                    r3c1.setBackground(Color.WHITE);
                }*/
            }
        });
        //r3c1 end
        //r3c2 start
        r3c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r3c2.setText(globle);
                    r3c2.setBackground(Color.WHITE);
                }
            }
        });
        //r3c2 end
        //r3c3 start
        r3c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r3c3.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*if(globle !="0") {
                    r3c3.setText(globle);
                    r3c3.setBackground(Color.WHITE);
                }*/
            }
        });
        //r3c3 end
        //r3c4 start
        r3c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r3c4.setText(globle);
                    r3c4.setBackground(Color.WHITE);
                }
            }
        });
        //r3c4 end
        //r3c5 start
        r3c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r3c5.setText(globle);
                    r3c5.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r3c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r3c5 end
        //r3c6 start
        r3c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r3c6.setText(globle);
                    r3c6.setBackground(Color.WHITE);
                }
            }
        });
        //r3c6 end
        //r3c7 start
        r3c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r3c7.setText(globle);
                    r3c7.setBackground(Color.WHITE);
                }
            }
        });
        //r3c7 end
        //r3c8 start
        r3c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                if(globle !="0") {
                    r3c8.setText(globle);
                    r3c8.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r3c8.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r3c8 end
        //r3c9 start
        r3c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r3c9.setText(globle);
                    r3c9.setBackground(Color.WHITE);
                }
            }
        });
        //r3c9 end

        //r4c1 start
        r4c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c1.setText(globle);
                    r4c1.setBackground(Color.WHITE);
                }
            }
        });
        //r4c1 end
        //r4c2 start
        r4c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c2.setText(globle);
                    r4c2.setBackground(Color.WHITE);
                }
            }
        });
        //r4c2 end
        //r4c3 start
        r4c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c3.setText(globle);
                    r4c3.setBackground(Color.WHITE);
                }
            }
        });
        //r4c3 end
        //r4c4 start
        r4c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c4.setText(globle);
                    r4c4.setBackground(Color.WHITE);
                }
            }
        });
        //r4c4 end
        //r4c5 start
        r4c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r4c5.setText(globle);
                    r4c5.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r4c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r4c5 end
        //r4c6 start
        r4c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c6.setText(globle);
                    r4c6.setBackground(Color.WHITE);
                }
            }
        });
        //r4c6 end
        //r4c7 start
        r4c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c7.setText(globle);
                    r4c7.setBackground(Color.WHITE);
                }
            }
        });
        //r4c7 end
        //r4c8 start
        r4c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              /*  if(globle !="0") {
                    r4c8.setText(globle);
                    r4c8.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r4c8.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r4c8 end
        //r4c9 start
        r4c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r4c9.setText(globle);
                    r4c9.setBackground(Color.WHITE);
                }
            }
        });
        //r4c9 end

        //r5c1 start
        r5c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r5c1.setText(globle);
                    r5c1.setBackground(Color.WHITE);
                }
            }
        });
        //r5c1 end
        //r5c2 start
        r5c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                if(globle !="0") {
                    r5c2.setText(globle);
                    r5c2.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r5c2.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r5c2 end
        //r5c3 start
        r5c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          /*      if(globle !="0") {
                    r5c3.setText(globle);
                    r5c3.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r5c3.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r5c3 end
        //r5c4 start
        r5c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r5c4.setText(globle);
                    r5c4.setBackground(Color.WHITE);
                }
            }
        });
        //r5c4 end
        //r5c5 start
        r5c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r5c5.setText(globle);
                    r5c5.setBackground(Color.WHITE);
                }
            }
        });
        //r5c5 end
        //r5c6 start
        r5c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r5c6.setText(globle);
                    r5c6.setBackground(Color.WHITE);
                }
            }
        });
        //r5c6 end
        //r5c7 start
        r5c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r5c7.setText(globle);
                    r5c7.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r5c7.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r5c7 end
        //r5c8 start
        r5c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              /*  if(globle !="0") {
                    r5c8.setText(globle);
                    r5c8.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r5c8.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r5c8 end
        //r5c9 start
        r5c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r5c9.setText(globle);
                    r5c9.setBackground(Color.WHITE);
                }
            }
        });
        //r5c9 end

        //r6c1 start
        r6c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c1.setText(globle);
                    r6c1.setBackground(Color.WHITE);
                }
            }
        });
        //r6c1 end
        //r6c2 start
        r6c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             /*   if(globle !="0") {
                    r6c2.setText(globle);
                    r6c2.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r6c2.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r6c2 end
        //r6c3 start
        r6c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c3.setText(globle);
                    r6c3.setBackground(Color.WHITE);
                }
            }
        });
        //r6c3 end
        //r6c4 start
        r6c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r6c4.setText(globle);
                    r6c4.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r6c4.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r6c4 end
        //r6c5 start
        r6c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*                if(globle !="0") {
                    r6c5.setText(globle);
                    r6c5.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r6c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r6c5 end
        //r6c6 start
        r6c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c6.setText(globle);
                    r6c6.setBackground(Color.WHITE);
                }
            }
        });
        //r6c6 end
        //r6c7 start
        r6c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c7.setText(globle);
                    r6c7.setBackground(Color.WHITE);
                }
            }
        });
        //r6c7 end
        //r6c8 start
        r6c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c8.setText(globle);
                    r6c8.setBackground(Color.WHITE);
                }
            }
        });
        //r6c8 end
        //r6c9 start
        r6c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r6c9.setText(globle);
                    r6c9.setBackground(Color.WHITE);
                }
            }
        });
        //r6c9 end

        //r7c1 start
        r7c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r7c1.setText(globle);
                    r7c1.setBackground(Color.WHITE);
                }
            }
        });
        //r7c1 end
        //r7c2 start
        r7c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r7c2.setText(globle);
                    r7c2.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r7c2.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r7c2 end
        //r7c3 start
        r7c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r7c3.setText(globle);
                    r7c3.setBackground(Color.WHITE);
                }
            }
        });
        //r7c3 end
        //r7c4 start
        r7c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r7c4.setText(globle);
                    r7c4.setBackground(Color.WHITE);
                }
            }
        });
        //r7c4 end
        //r7c5 start
        r7c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r7c5.setText(globle);
                    r7c5.setBackground(Color.WHITE);
                } */
                JOptionPane.showConfirmDialog(r7c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r7c5 end
        //r7c6 start
        r7c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r7c6.setText(globle);
                    r7c6.setBackground(Color.WHITE);
                }
            }
        });
        //r7c6 end
        //r7c7 start
        r7c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             /*   if(globle !="0") {
                    r7c7.setText(globle);
                    r7c7.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r7c7.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r7c7 end
        //r7c8 start
        r7c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r7c8.setText(globle);
                    r7c8.setBackground(Color.WHITE);
                }
            }
        });
        //r7c8 end
        //r7c9 start
        r7c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              /*  if(globle !="0") {
                    r7c9.setText(globle);
                    r7c9.setBackground(Color.WHITE);
                } */
                JOptionPane.showConfirmDialog(r7c9.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r7c9 end

        //r8c1 start
        r8c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r8c1.setText(globle);
                    r8c1.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r8c1.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r8c1 end
        //r8c2 start
        r8c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r8c2.setText(globle);
                    r8c2.setBackground(Color.WHITE);
                }
            }
        });
        //r8c2 end
        //r8c3 start
        r8c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r8c3.setText(globle);
                    r8c3.setBackground(Color.WHITE);
                }
            }
        });
        //r8c3 end
        //r8c4 start
        r8c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r8c4.setText(globle);
                    r8c4.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r8c4.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r8c4 end
        //r8c5 start
        r8c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*if(globle !="0") {
                    r8c5.setText(globle);
                    r8c5.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r8c5.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r8c5 end
        //r8c6 start
        r8c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r8c6.setText(globle);
                    r8c6.setBackground(Color.WHITE);
                }
            }
        });
        //r8c6 end
        //r8c7 start
        r8c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r8c7.setText(globle);
                    r8c7.setBackground(Color.WHITE);
                }
            }
        });
        //r8c7 end
        //r8c8 start
        r8c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r8c8.setText(globle);
                    r8c8.setBackground(Color.WHITE);
                }
            }
        });
        //r8c8 end
        //r8c9 start
        r8c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r8c9.setText(globle);
                    r8c9.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r8c9.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r8c9 end

        //r9c1 start
        r9c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r9c1.setText(globle);
                    r9c1.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r9c1.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r9c1 end
        //r9c2 start
        r9c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              /*  if(globle !="0") {
                    r9c2.setText(globle);
                    r9c2.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r9c2.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r9c2 end
        //r9c3 start
        r9c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(globle !="0") {
                    r9c3.setText(globle);
                    r9c3.setBackground(Color.WHITE);
                }*/
                JOptionPane.showConfirmDialog(r9c3.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        //r9c3 end
        //r9c4 start
        r9c4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r9c4.setText(globle);
                    r9c4.setBackground(Color.WHITE);
                }
            }
        });
        //r9c4 end
        //r9c5 start
        r9c5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r9c5.setText(globle);
                    r9c5.setBackground(Color.WHITE);
                }
            }
        });
        //r9c5 end
        //r9c6 start
        r9c6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(r9c6.getParent(),"This place is already allocated","Message",JOptionPane.INFORMATION_MESSAGE);

                /*  if(globle !="0") {
                    r9c6.setText(globle);
                    r9c6.setBackground(Color.WHITE);
                }*/
            }
        });
        //r9c6 end
        //r9c7 start
        r9c7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r9c7.setText(globle);
                    r9c7.setBackground(Color.WHITE);
                }
            }
        });
        //r9c7 end
        //r9c8 start
        r9c8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r9c8.setText(globle);
                    r9c8.setBackground(Color.WHITE);
                }
            }
        });
        //r9c8 end
        //r9c9 start
        r9c9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(globle !="0") {
                    r9c9.setText(globle);
                    r9c9.setBackground(Color.WHITE);
                }
            }
        });
        //r9c9 end
        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(e.paramString());
                Color c = r1c2.getBackground();
              for(int i=0;i<9;i++)  {
                  for(int j=0;j<9;j++){
                      boolean flag=true;
                      for(int k=0;k<preDefButtons.length;k++){
                          if(Butns[i][j]==preDefButtons[k]){
                              flag=false;
                          }
                      }
                if(flag==true){
                    Butns[i][j].setText(" ");
                    Butns[i][j].setForeground(Color.black);
                    Butns[i][j].setBackground(c);
                }
                  }
              }
            }
        });
        showsol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<9;i++)  {
                    for(int j=0;j<9;j++){
                        boolean flag=true;
                        for(int k=0;k<preDefButtons.length;k++){
                            if(Butns[i][j]==preDefButtons[k]){
                                flag=false;
                            }
                        }
                        if(flag==true){
                            Butns[i][j].setText(solvedBoard[i][j]);
                            Butns[i][j].setForeground(Color.black);
                            Butns[i][j].setBackground(Color.WHITE);
                        }
                    }
                }
            }
        });
        chkm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<9;i++)  {
                    for(int j=0;j<9;j++){
                        boolean flag=true;
                       for(int k=0;k<preDefButtons.length;k++){
                           if(Butns[i][j]==preDefButtons[k]){
                               flag=false;
                           }
                        }
                        if(flag==true && Butns[i][j].getText() !="" && Butns[i][j].getText()==solvedBoard[i][j]){
                           // Butns[i][j].setText(solvedBoard[i][j]);
                            Butns[i][j].setBackground(Color.GREEN);
                                                  }
                        else if(Butns[i][j].getText() !=" " && Butns[i][j].getText() !=""  && Butns[i][j].getText()!=solvedBoard[i][j])
                            Butns[i][j].setBackground(Color.RED);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Sudocu_test dialog = new Sudocu_test();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }




}
