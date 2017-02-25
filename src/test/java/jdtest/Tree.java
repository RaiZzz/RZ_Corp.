package jdtest;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by MadMax on 1/11/2017.
 *
 * Implement search functionality using a method with the footprint: Tree firstMatch(Tree, Regex).
 * This method takes a tree, searches that tree for leaves/branches in which the data  matches the given
 * regex expression and returns the first branch/leaf (another Tree object) that matches.
 * You should implement two different search algorithms: a Depth-First Search (DFS),
 * and another search algorithm of your choice.
 *
 */
public class Tree {
    private List<Tree> leaves = new LinkedList<Tree>();
    private Tree parent = null;
    private String data;

    public Tree(String data, Tree parent) {
        this.data = data;
        this.parent = parent;
    }

    public void firstMatch (Tree tree, Regex regex)
    {

















        /*Stack<node> stack=new  Stack<node>();
        stack.add(node);
        node.visited=true;
        while (!stack.isEmpty())
        {
            Node element=stack.pop();
            System.out.print(element.data + "\t");

            ArrayList<node> neighbours=findNeighbours(adjacency_matrix,element);
            for (int i = 0; i < neighbours.size(); i++) {
                Node n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    stack.add(n);
                    n.visited=true;

                }
            }
        }*/
    }
}