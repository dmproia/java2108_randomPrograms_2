
/**
 * Create a BST instance and insert randomly generated Integer objects.
 * 
 * @author Carol Dean 
 * @version 11-27-12
 */

import java.util.*;
public class BSTTester
{
    public static long startTime;
    public static long endTime;
    public static long totalTime;
    public static void main(String args[])
    {
        startTime = System.nanoTime();        
        int n = 1000;
        Random random = new Random();
        BinarySearchTree<Integer> testBST = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n2 = 2000;
        Random random2 = new Random();
        BinarySearchTree<Integer> testBST2 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n2 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n3 = 4000;
        Random random3 = new Random();
        BinarySearchTree<Integer> testBST3 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n3 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n4 = 8000;
        Random random4 = new Random();
        BinarySearchTree<Integer> testBST4 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n4 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n5 = 16000;
        Random random5 = new Random();
        BinarySearchTree<Integer> testBST5 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n5 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n6 = 32000;
        Random random6 = new Random();
        BinarySearchTree<Integer> testBST6 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n6 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n7 = 64000;
        Random random7 = new Random();
        BinarySearchTree<Integer> testBST7 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n7 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n8 = 128000;
        Random random8 = new Random();
        BinarySearchTree<Integer> testBST8 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n8 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n9 = 256000;
        Random random9 = new Random();
        BinarySearchTree<Integer> testBST9 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n9 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n10 = 512000;
        Random random10 = new Random();
        BinarySearchTree<Integer> testBST10 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n10 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
        startTime = System.nanoTime();        
        int n11 = 1024000;
        Random random11 = new Random();
        BinarySearchTree<Integer> testBST11 = new BinarySearchTree<Integer>();
        for(int i = 0; i < n; i++)
        {
            testBST.add( random.nextInt() );
        }
        endTime = System.nanoTime();
        totalTime = endTime - startTime;               
        System.out.println("n = " + n11 + " has tree height of " + testBST.height() + " and " + testBST.size() + " number of nodes. With " + totalTime + " completion time.");
        
    }//end of main method

}//end of BSTTester