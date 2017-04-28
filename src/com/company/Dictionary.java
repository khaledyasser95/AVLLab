package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Amr on 4/23/2017.
 */
public class Dictionary {
    private AvlTree tree;
    private Scanner scan;
    public void setTree(AvlTree tree) {this.tree = tree;}

    public void addFileToDictionary(){
        try {
            //gui.print.setText();

            scan = new Scanner(new File("Dictionary.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                tree.insert(temp);
                System.out.print(temp+" Added to the DICTIONARY, ");
                System.out.println("Size of the Dictionary "+tree.countNodes()+" Height of the tree " + tree.getRoot().getHeight());
            }
        }catch (Exception e) {
            System.out.println("error reading the file");
        }
    }

    public void addWord(String word){
        tree.insert(word);
        System.out.println(word+" Added");
        System.out.println("Size of the Dictionary "+tree.countNodes()+" Height of the tree " + tree.getRoot().getHeight());
    }

    public void searchDictionary(){
        try {
            scan = new Scanner(new File("queries.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                if(tree.search(temp))
                    System.out.println(temp+ " FOUND");
                else
                    System.out.println(temp +" NOT FOUND");
            }
        }catch (Exception e) {
            System.out.println("error reading the file");
        }
    }

    public void searchWord(String word){
        if(tree.search(word))
            System.out.println(word+" FOUND");
        else
            System.out.println(word+" NOT FOUND");
    }

    public void deleteQueries(){
        try {
            scan = new Scanner(new File("deletions.txt"));
            while (scan.hasNext()) {
                String temp = scan.next();
                if(tree.search(temp)) {
                    tree.delete(temp);
                    System.out.println(temp+" DELETED");
                    System.out.println("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
                }
                else {
                    System.out.println(temp + " NOT FOUND to be deleted");
                    System.out.println("Size of the Dictionary "+tree.countNodes()+ " Height of the tree "+tree.getRoot().getHeight());
                }
            }
        }catch (Exception e) {
            System.out.println("ERROR reading the file");
        }
    }

    public void deleteWord(String word){
        if(tree.search(word)){
            tree.delete(word);
            System.out.println(word+" DELETED");
            System.out.println("Size of the Dictionary "+tree.countNodes()+" Height of the tree "+tree.getRoot().getHeight());
        }
        else {
            System.out.println(word + " NOT FOUND to be deleted");
            System.out.println("Size of the Dictionary " + tree.countNodes() + " Height of the tree " + tree.getRoot().getHeight());
        }
    }

    public int dictionarySize(){
        return tree.countNodes();
    }

    public  void dictionaryHeight(){
        try {
            System.out.println(tree.getRoot().getHeight());
        }catch (Exception e){
            System.out.println("Empty AVL of height ZERO");
        }
    }
}

