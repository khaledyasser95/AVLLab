package com.company;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
/**
 * Created by ICY on 5/8/2017.
 */
public class Drawtree <type extends   Comparable<type> >extends JApplet {
    final  Color bg = Color.white;
    final  Color fg = Color.black;
    final  Color red = Color.red;
    final  Color white = Color.white;
    final  BasicStroke stroke = new BasicStroke(2.0f);
    final  BasicStroke wideStroke = new BasicStroke(8.0f);
    private AvlNode<type> r;
    AvlTree avl = new AvlTree();

    Dimension totalSize;
    int height,width;

    public void init(AvlNode<type> N,int x) {
        //Initialize drawing colors
        setBackground(bg);
        setForeground(fg);
        r=N;
        width=x;
    }
    Graphics2D g2;


    public void paint(Graphics g) {
        this.getContentPane().setBackground(Color.red);
        g2=  (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        getSize();
        inorder(r,0,width,80);
    }

    public void draw(int x1,int x2,int y,String n,int d){
        g2.setStroke(stroke);
        g2.setPaint(Color.yellow);
        int x=(x1+x2)/2;
        if(d==1)
            g2.draw(new Line2D.Double(x2, y-30, x+15, y));
        else if(d==2)
            g2.draw(new Line2D.Double(x+15, y,x1+30 , y-30));
        g2.setPaint(Color.blue);
        Shape circle=new Ellipse2D.Double((x1+x2)/2,y, 30, 30);
        g2.draw(circle);
        g2.fill(circle);
        g2.setPaint(Color.white);
        g2.drawString(n, x+10, y+18);
    }

    int x1=500,y1=30;
    void inorder(AvlNode<type> r,int x1,int x2,int y){
        if(r==null) return;

        inorder(r.left,x1,(x1+x2)/2,y+40);
        // if ( Parent == NULL)
        if(avl.getRoot()==null) draw(x1,x2,y,r.data+"",0);
        else{
            // if (Parent.data< Current data)
            if(Lessthan())	draw(x1,x2,y,r.data+"",2);
            else			draw(x1,x2,y,r.data+"",1);
        }
        inorder(r.right,(x1+x2)/2,x2,y+40);
    }
   public boolean isGreaterThan() {
        return avl.rootdata().compareTo(r.data)>0;
    }
   public boolean Lessthan() {
        return avl.rootdata().compareTo(r.data)<0;
    }
}

