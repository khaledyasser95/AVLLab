package com.company;

/**
 * Created by Amr on 4/23/2017.
 */

public class AvlTree <type extends Comparable<? super type>> {

    private AvlNode<type> root;

    public AvlNode<type> getRoot()
    {
        return root;
    }

    public void insert(type data) {
        root = insert(data, root);
    }

    private AvlNode<type> insert(type x, AvlNode<type> t) {
        if(t==null)
            return new AvlNode<>(x);
        if(x.compareTo(t.data) < 0)
            t.left = insert(x,t.left);
        else if(x.compareTo(t.data) > 0)
            t.right = insert(x,t.right);
        else System.out.println("ERROR:"+x +" already in the Dictionary!");
        return balance(t);
    }

    private int height(AvlNode<type> t)
    {
        return t == null ? -1 : t.height;
    }

    private AvlNode<type> rotateWithLeftChild(AvlNode<type> k2) {
        AvlNode<type> k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = Math.max( height( k1.left ), k2.height ) + 1;
        return k1;
    }

    private AvlNode<type> rotateWithRightChild(AvlNode<type> k1) {
        AvlNode<type> k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = Math.max( height( k2.right ), k1.height ) + 1;
        return k2;
    }

    private AvlNode<type> doubleWithLeftChild(AvlNode<type> k3) {
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }

    private AvlNode<type> doubleWithRightChild(AvlNode<type> k1) {
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(AvlNode<type> r) {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }

    public boolean search(type val)
    {
        return search(root, val);
    }

    private boolean search(AvlNode<type> r, type val) {
        boolean found = false;
        while ((r != null) && !found)
        {
            type temp = r.data;
            if (val.compareTo(temp) < 0)
                r = r.left;
            else if (val.compareTo(temp) > 0)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }

    public AvlNode<type> delete(type val)
    {
        return delete(val,root);
    }

    private AvlNode<type> delete(type x, AvlNode<type> t){
        if (t ==null){
            System.out.println(x+", Word not found to be deleted!");
            return t;
        }
        if (x.compareTo(t.data) < 0)
            t.left = delete(x,t.left);
        else if(x.compareTo(t.data) > 0)
            t.right = delete(x,t.right);
        else if(t.left != null && t.right != null)
        {
            t.data = findMin(t.right).data;
            t.right = delete(t.data,t.right);
        }
        else
            t = (t.left != null) ? t.left:t.right;
        return balance(t);
}


    private final static int BalanceFactor = 1;
    private AvlNode<type> balance(AvlNode<type> t) {
    if(t==null)
        return t;
    if(height(t.left) - height(t.right) > BalanceFactor)
        if(height(t.left.left) >= height(t.left.right))
            t = rotateWithLeftChild(t);
         else
            t = doubleWithLeftChild(t);
    else if(height(t.right) - height(t.left) > BalanceFactor)
        if(height(t.right.right) >= height(t.right.left))
            t = rotateWithRightChild(t);
        else
            t = doubleWithRightChild(t);

    t.height= Math.max(height(t.left),height(t.right))+1;
    return t;
    }

    private AvlNode<type> findMin(AvlNode<type> node) {
    if(node == null)
        return null;
    else if(node.left == null)
        return node;
    return findMin(node.left);
    }
}

