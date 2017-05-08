/*
 * Title: TreeTest
 * Author: Matthew Boyette
 * Date: 5/7/2017
 * 
 * This is a test program demonstrating a minimalist generic binary search tree data structure.
 */

import api.util.datastructures.Tree;

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
        TreeTest.delete(t, -4);
        TreeTest.delete(t, 3);
        TreeTest.delete(t, 17);
        TreeTest.delete(t, 21);
        TreeTest.delete(t, 2);
        TreeTest.delete(t, 18);
        TreeTest.delete(t, 5);
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

    public static void insertions(final Tree<Integer> t)
    {
        TreeTest.insert(t, 5);
        TreeTest.insert(t, 2);
        TreeTest.insert(t, 18);
        TreeTest.insert(t, -4);
        TreeTest.insert(t, 3);
        TreeTest.insert(t, 17);
        TreeTest.insert(t, 21);
        StdOut.println();
    }

    public static void main(String[] args)
    {
        Tree<Integer> t = new Tree<Integer>();
        TreeTest.display(t);
        TreeTest.insertions(t);
        TreeTest.display(t);
        TreeTest.deletions(t);
        TreeTest.display(t);
    }
}
