package main;

import bag.Object;

public class Tree {
    public Object summit;
    public Tree left = null;
    public Tree right = null;

    public int value;
    
    public Tree(Object summit, Tree left, Tree right) {
        this.summit = summit;
        this.left = left;
        this.right = right;
    }

}
