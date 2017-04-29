package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AvlTree avl = new AvlTree();
        Dictionary dic = new Dictionary();
        dic.setTree(avl);
        System.out.println("\t\t\tEnter the option you want to do: ");
        System.out.print("1-Add Dictionary.txt to AVL.\n"+"2-Search queries.txt in AVL.\n"+
                         "3-Delete some words from AVL.\n"+"4-Insert 1 word in the AVL.\n"+
                         "5-Search 1 word in the AVL.\n"+"6-Delete 1 word from AVL.\n"+
                         "7-print number of words in the AVL\n"+"8-Print height of the AVL\n"+
                         "9-Print the In Order Traversal\n"+"10-Gui\n"+"0-END TESTING\n");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        while (option != 0) {
            scan.nextLine();
            switch (option) {
                case 1:{
                    dic.addFileToDictionary();
                    break;
                }
                case 2:{
                    dic.searchDictionary();
                    break;
                }
                case 3:{
                    dic.deleteQueries();
                    break;
                }
                case 4:{
                    System.out.println("Enter the word you want to insert:");
                    dic.addWord(scan.nextLine());
                    break;
                }
                case 5:{
                    System.out.println("Enter the word you want to search for: ");
                    dic.searchWord(scan.nextLine());
                    break;
                }
                case 6:{
                    System.out.println("Enter the word you want to delete: ");
                    dic.deleteWord(scan.nextLine());
                    break;
                }
                case 7:{
                    System.out.println(dic.dictionarySize()+" words in the AVL");
                    break;
                }
                case 8:{
                    dic.dictionaryHeight();
                    break;
                }
                case 9:{
                    dic.inOrderTraversal(avl.getRoot());
                    break;
                }
                case 10:{
                   Avl_Gui gui = new Avl_Gui();
                   gui.pack();
                   gui.setVisible(true);
                    break;
                }
                default:{
                    System.out.println("ENTER A VALID OPTION");
                    break;
                }
            }
            System.out.println("\nEnter the next option you want to perform: ");
            option = scan.nextInt();
        }
        System.out.println("you have ENDED the test :D");
    }
}
