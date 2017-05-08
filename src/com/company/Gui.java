package com.company;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
/**
 * Created by ICY on 5/8/2017.
 */
/*
 class Gui extends JFrame implements ActionListener {
    private static final long serialVersionUID = -2829448395694197965L;
    AvlTree B = new AvlTree();
    Dictionary dic = new Dictionary(this);
    public Gui(){
        this.setSize(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("AVL Tree");
        panel1 = new JPanel();
        */
/*************buttons******//*

        button0 = new JButton("Insert");
        button1 = new JButton("Find");
        button2 = new JButton("Delete");
        button3 = new JButton("Show Tree");
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        panel1.add(button0);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        dic.setTree(B);
        Border b = BorderFactory.createEmptyBorder(45,0,0, 0);
        panel1.setBorder(b);
        this.add(panel1);
        this.setVisible(true);
    }
    JPanel panel1;
    private JButton button0,button1,button2,button3;

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button0){
            String s=JOptionPane.showInputDialog("Enter the integer value");
            int i=Integer.parseInt(s);
            B.insert(i);
        }else if(e.getSource() == button1){
            String s=JOptionPane.showInputDialog("Enter the integer value");
            int i=Integer.parseInt(s);
            if(B.search(i))
                JOptionPane.showMessageDialog(null,"Not Found");
            else
                JOptionPane.showMessageDialog(null,"Found");
        }else if(e.getSource() == button2){
            String s=JOptionPane.showInputDialog("Enter the integer value");
            int i=Integer.parseInt(s);
            Node temp=B.search(i,B.root);
            if(temp==null)
                JOptionPane.showMessageDialog(null,"Not Found");
            else{
                B.remove(temp);
                JOptionPane.showMessageDialog(null,"Removed");
            }
        }else if(e.getSource() == button3){
            JFrame f = new JFrame("AVL Tree");
            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) { }
            });
            Drawtree applet = new Drawtree();
            f.getContentPane().add("Center", applet);
            Toolkit tk = Toolkit.getDefaultToolkit();
            int xSize = ((int) tk.getScreenSize().getWidth());
            applet.init(B.root,xSize-50);
            f.pack();
            f.setSize(new Dimension(xSize,500));
            f.setVisible(true);
        }
    }
}
*/
