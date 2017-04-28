/*
 * Created by JFormDesigner on Fri Apr 28 01:56:41 EET 2017
 */

package com.company;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author k y
 */
public class Avl_Gui extends JFrame {
    AvlTree avl = new AvlTree();
    Dictionary dic = new Dictionary(this);
    public Avl_Gui() {
        initComponents();
        dic.setTree(avl);
    }

    private void AddActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.addFileToDictionary();
        Action.setText("Add");

    }

    private void SearchActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.searchDictionary();
        Action.setText("Search");
    }

    private void Delete_someActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.deleteQueries();
        Action.setText("Delete some");
    }

    private void InsertActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.addWord(insert_txt.getText());
        Action.setText("Insert " + insert_txt.getText());
    }

    private void FindActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.searchWord(search_txt.getText());
        Action.setText("Find " + search_txt.getText());
    }

    private void RemoveActionPerformed(ActionEvent e) {
        // TODO add your code here
        dic.deleteWord(delete_txt.getText());
        Action.setText("Remove " + delete_txt.getText());
    }

    private void wordsActionPerformed(ActionEvent e) {
        // TODO add your code here
        Print.append("  " + dic.dictionarySize() + " words in the AVL" + "\n");
        Action.setText("Getting number of words");
    }

    private void heightActionPerformed(ActionEvent e) {
        dic.dictionaryHeight();
        Action.setText("Getting Height");
    }
    public void text_add(String txt) throws BadLocationException {

        Print.append("  " + txt + "\n");
    }

    public void text(String txt) {

        Print.append("  " + txt + "\n");
        Print.append("     -------------------------------------------------\n");
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
    private JLabel label1;
    private JTextArea Action;
    private JButton Add;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextArea Print;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

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
        label1 = new JLabel();
        Action = new JTextArea();
        Add = new JButton();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        Print = new JTextArea();

        //======== this ========
        setResizable(false);
        setMinimumSize(new Dimension(10, 30));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avl_Lab");
        setType(Window.Type.POPUP);
        setAutoRequestFocus(false);
        setForeground(new Color(60, 63, 65));
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== but_panel ========
        {
            but_panel.setForeground(Color.darkGray);

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
            words.addActionListener(e -> wordsActionPerformed(e));

            //---- height ----
            height.setText("height");
            height.addActionListener(e -> heightActionPerformed(e));

            //---- label1 ----
            label1.setText("ACTION TAKEN :");

            //---- Action ----
            Action.setEditable(false);

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
                                .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(Remove, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Insert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Find, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(Add, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(but_panelLayout.createSequentialGroup()
                                        .addComponent(Search, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Delete_some))
                                    .addComponent(search_txt, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(insert_txt, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(delete_txt, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                            .addGroup(but_panelLayout.createSequentialGroup()
                                .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(but_panelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(label1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Action, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                    .addGroup(but_panelLayout.createSequentialGroup()
                                        .addComponent(words, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(height, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
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
                        .addGroup(but_panelLayout.createParallelGroup()
                            .addComponent(Insert)
                            .addComponent(insert_txt))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(Find)
                            .addComponent(search_txt, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup()
                            .addComponent(Remove)
                            .addComponent(delete_txt))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(words, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(height))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(but_panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(Action, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))
            );
        }
        contentPane.add(but_panel);
        but_panel.setBounds(5, 0, 345, 220);

        //======== panel1 ========
        {
            panel1.setForeground(new Color(60, 63, 65));

            //======== scrollPane1 ========
            {

                //---- Print ----
                Print.setEditable(false);
                Print.setBackground(SystemColor.window);
                Print.setForeground(new Color(60, 63, 65));
                scrollPane1.setViewportView(Print);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
            );
        }
        contentPane.add(panel1);
        panel1.setBounds(355, 0, 345, 215);

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
        setSize(715, 255);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
