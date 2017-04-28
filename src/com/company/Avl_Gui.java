/*
 * Created by JFormDesigner on Fri Apr 28 01:56:41 EET 2017
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author k y
 */
public class Avl_Gui extends JFrame {
    Main main = new Main();
    AvlTree avl = new AvlTree();
    Dictionary dic = new Dictionary();
    JTextPane print = new JTextPane();
    public Avl_Gui() {
        initComponents();
    }

    private void AddActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.addFileToDictionary();

    }

    private void SearchActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.searchDictionary();

    }

    private void Delete_someActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.deleteQueries();
    }

    private void InsertActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.addWord(insert_txt.getText());
    }

    private void FindActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.searchWord(search_txt.getText());
    }

    private void RemoveActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.deleteWord(delete_txt.getText());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - k y
        but_panel = new JPanel();
        Search = new JButton();
        Delete_some = new JButton();
        Insert = new JButton();
        Find = new JButton();
        Remove = new JButton();
        words = new JButton();
        height = new JButton();
        search_txt = new JTextArea();
        insert_txt = new JTextArea();
        delete_txt = new JTextArea();
        textArea5 = new JTextArea();
        textArea6 = new JTextArea();
        label1 = new JLabel();
        textArea7 = new JTextArea();
        Add = new JButton();
        panel1 = new JPanel();
        scrollPane2 = new JScrollPane();
        Print = new JTextPane();

        //======== this ========
        setResizable(false);
        setMinimumSize(new Dimension(10, 30));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== but_panel ========
        {

            // JFormDesigner evaluation mark
            but_panel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), but_panel.getBorder())); but_panel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- Search ----
            Search.setText("Search queries");
            Search.addActionListener(e -> SearchActionPerformed(e));

            //---- Delete_some ----
            Delete_some.setText("Delete");
            Delete_some.addActionListener(e -> Delete_someActionPerformed(e));

            //---- Insert ----
            Insert.setText("Insert");
            Insert.addActionListener(e -> InsertActionPerformed(e));

            //---- Find ----
            Find.setText("Search");
            Find.addActionListener(e -> FindActionPerformed(e));

            //---- Remove ----
            Remove.setText("Delete");
            Remove.addActionListener(e -> RemoveActionPerformed(e));

            //---- words ----
            words.setText("number of words");

            //---- height ----
            height.setText("height");

            //---- label1 ----
            label1.setText("ACTION TAKEN :");

            //---- Add ----
            Add.setText("Add Dictionery");
            Add.addActionListener(e -> AddActionPerformed(e));

            GroupLayout but_panelLayout = new GroupLayout(but_panel);
            but_panel.setLayout(but_panelLayout);
            but_panelLayout.setHorizontalGroup(
                but_panelLayout.createParallelGroup()
                    .addGroup(but_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(but_panelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, but_panelLayout.createSequentialGroup()
                                .addComponent(words, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
                            .addGroup(but_panelLayout.createSequentialGroup()
                                .addComponent(height, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textArea6))
                            .addGroup(but_panelLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, but_panelLayout.createSequentialGroup()
                                .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(Remove, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Insert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Find, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Add, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(but_panelLayout.createParallelGroup()
                                    .addGroup(but_panelLayout.createSequentialGroup()
                                        .addComponent(Search, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Delete_some))
                                    .addGroup(but_panelLayout.createParallelGroup()
                                        .addComponent(insert_txt, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search_txt, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delete_txt, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
            );
            but_panelLayout.setVerticalGroup(
                but_panelLayout.createParallelGroup()
                    .addGroup(but_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Search)
                            .addComponent(Delete_some))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(Insert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(insert_txt))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(search_txt, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Find))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(Remove, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete_txt))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup()
                            .addComponent(textArea5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(words, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup()
                            .addComponent(height)
                            .addComponent(textArea6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(textArea7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(8, Short.MAX_VALUE))
            );
        }
        contentPane.add(but_panel);
        but_panel.setBounds(5, 0, 345, 255);

        //======== panel1 ========
        {

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(Print);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane2)
                        .addContainerGap())
            );
        }
        contentPane.add(panel1);
        panel1.setBounds(355, 0, 295, 260);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(660, 290);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        dic.setTree(avl);
        print=Print;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - k y
    private JPanel but_panel;
    private JButton Search;
    private JButton Delete_some;
    private JButton Insert;
    private JButton Find;
    private JButton Remove;
    private JButton words;
    private JButton height;
    private JTextArea search_txt;
    private JTextArea insert_txt;
    private JTextArea delete_txt;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JLabel label1;
    private JTextArea textArea7;
    private JButton Add;
    private JPanel panel1;
    private JScrollPane scrollPane2;
    private JTextPane Print;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
