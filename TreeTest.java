/*
 * Title: TreeTest
 * Author: Matthew Boyette
 * Date: 5/7/2017
 * 
 * This is a test program demonstrating a minimalist generic binary search tree data structure.
 */

import api.util.datastructures.Tree;
import api.util.datastructures.TreeNode.TRAVERSAL_ORDER;
import edu.princeton.cs.introcs.StdOut;

public class TreeTest
{
    public static void delete(final Tree<Integer> t, final int n)
    {
        String find = String.format("Tree.find(%d)", n);
        String delete = String.format("Tree.delete(%d)", n);
        StdOut.printf("%-20s: %s%n", find, t.find(n));
        StdOut.printf("%-20s: %s%n", delete, t.delete(n));
        StdOut.printf("%-20s: %s%n%n", find, t.find(n));
    }

    public static void deletions(final Tree<Integer> t)
    {
        /*
         * TreeTest.delete(t, 90);
         * TreeTest.delete(t, 30);
         * TreeTest.delete(t, 80);
         * TreeTest.delete(t, 40);
         */
    }

    public static void display(final Tree<Integer> t)
    {
        StdOut.printf("%-20s: %s%n", "Tree.isEmpty()", t.isEmpty());
        StdOut.printf("%-20s: %s%n%n", "Tree.getSize()", t.getSize());
    }

    public static void insert(final Tree<Integer> t, final int n)
    {
        String insert = String.format("Tree.insert(%d)", n);
        StdOut.printf("%-20s: %s%n", insert, t.insert(n));
    }

    public static void insertions_b(final Tree<Integer> t)
    {
        /* Balanced BST */
        // 60,40,80,50,70,90,30
        TreeTest.insert(t, 60);
        TreeTest.insert(t, 40);
        TreeTest.insert(t, 80);
        TreeTest.insert(t, 50);
        TreeTest.insert(t, 70);
        TreeTest.insert(t, 90);
        TreeTest.insert(t, 30);
        StdOut.println();
    }

    public static void insertions_l(final Tree<Integer> t)
    {
        /* Left-Skewed BST */
        // 90,80,70,60,50,40,30
        TreeTest.insert(t, 90);
        TreeTest.insert(t, 80);
        TreeTest.insert(t, 70);
        TreeTest.insert(t, 60);
        TreeTest.insert(t, 50);
        TreeTest.insert(t, 40);
        TreeTest.insert(t, 30);
        StdOut.println();
    }

    public static void insertions_r(final Tree<Integer> t)
    {
        /* Right-Skewed BST */
        // 30,40,50,60,70,80,90
        TreeTest.insert(t, 30);
        TreeTest.insert(t, 40);
        TreeTest.insert(t, 50);
        TreeTest.insert(t, 60);
        TreeTest.insert(t, 70);
        TreeTest.insert(t, 80);
        TreeTest.insert(t, 90);
        StdOut.println();
    }

    public static void main(String[] args)
    {
        Tree<Integer> t;

        t = new Tree<Integer>();
        TreeTest.display(t);
        TreeTest.insertions_b(t);
        TreeTest.display(t);
        TreeTest.deletions(t);
        StdOut.println(t.toString(TRAVERSAL_ORDER.DEFAULT));
        StdOut.println(t.toString(TRAVERSAL_ORDER.IN));
        StdOut.println(t.toString(TRAVERSAL_ORDER.PRE));
        StdOut.println(t.toString(TRAVERSAL_ORDER.POST));

        t = new Tree<Integer>();
        TreeTest.display(t);
        TreeTest.insertions_r(t);
        TreeTest.display(t);
        TreeTest.deletions(t);
        StdOut.println(t.toString(TRAVERSAL_ORDER.DEFAULT));
        StdOut.println(t.toString(TRAVERSAL_ORDER.IN));
        StdOut.println(t.toString(TRAVERSAL_ORDER.PRE));
        StdOut.println(t.toString(TRAVERSAL_ORDER.POST));

        t = new Tree<Integer>();
        TreeTest.display(t);
        TreeTest.insertions_l(t);
        TreeTest.display(t);
        TreeTest.deletions(t);
        StdOut.println(t.toString(TRAVERSAL_ORDER.DEFAULT));
        StdOut.println(t.toString(TRAVERSAL_ORDER.IN));
        StdOut.println(t.toString(TRAVERSAL_ORDER.PRE));
        StdOut.println(t.toString(TRAVERSAL_ORDER.POST));
    }
}
