package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Amr on 4/23/2017.
 */
public class Dictionary {

    private AvlTree tree;
    private Scanner scan;
private Avl_Gui gui;

    public Dictionary() {
    }

    public Dictionary(Avl_Gui gui) {
        this.gui = gui;
    }


    public void setTree(AvlTree tree) {this.tree = tree;}

    public void addFileToDictionary(){
        try {

            scan = new Scanner(new File("Dictionary.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                tree.insert(temp);
                gui.text_add(temp+" Added to the DICTIONARY, ");
                gui.text("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
            }
        }catch (Exception e) {
            gui.text("error reading the file");
        }
    }

    public void addWord(String word){
        tree.insert(word);
        gui.text(word+" Added");
        gui.text("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
    }

    public void searchDictionary(){
        try {
            scan = new Scanner(new File("queries.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                if(tree.search(temp))
                    gui.text(temp+ " FOUND");
                else
                    gui.text(temp +" NOT FOUND");
            }
        }catch (Exception e) {
            gui.text("ERROR reading the file");
        }
    }

    public void searchWord(String word){
        if(tree.search(word))
            gui.text(word+" FOUND");
        else
            gui.text(word+" NOT FOUND");
    }

    public void deleteQueries(){
        try {
            scan = new Scanner(new File("deletions.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                if(tree.search(temp)) {
                    tree.delete(temp);
                    gui.text(temp+" DELETED");
                }
                else
                    gui.text(temp + " NOT FOUND to be deleted");
                gui.text("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
            }
        }catch (Exception e) {
            gui.text("ERROR reading the file");
        }
    }

    public void deleteWord(String word){
        if(tree.search(word)){
            tree.delete(word);
            gui.text(word+" DELETED");
        }
        else
            gui.text(word + " NOT FOUND to be deleted");
        gui.text("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
    }

    public int dictionarySize(){
        return tree.countNodes();
    }

    public  void dictionaryHeight(){
        try {
            gui.text("Height of the AVL tree is "+tree.getRoot().getHeight());
        }catch (Exception e){
            gui.text("Empty AVL of height ZERO");
        }
    }

    public void inOrderTraversal( AvlNode node){
        if(tree.countNodes()==0){
            gui.text("EMPTY DICTIONARY");
            return;
        }
        if(node != null)
        {
            inOrderTraversal(node.left);

            gui.text(String.valueOf(node.data));

            inOrderTraversal(node.right);

        }
    }
}

