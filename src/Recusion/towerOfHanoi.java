package Recusion;
//Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks.
// Initially, all the disks are stacked in decreasing value of diameter i.e.,
// the smallest disk is placed on the top and they are on rod A.
// The objective of the puzzle is to move the entire stack to another rod (here considered C), obeying the following simple rules:
//
//Only one disk can be moved at a time.
//Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.
// e. a disk can only be moved if it is the uppermost disk on a stack.
//No disk may be placed on top of a smaller disk

public class towerOfHanoi {
    static void towerHanoi(int n, char a, char b, char c) {
        if (n == 0) {
//            System.out.println("Move 1 from to " + a + " to" + c); // Base Case
            return  ;
        }
        towerHanoi(n - 1, a, c, b);
        System.out.println("Move" + n + " from " + a + " to" + c);
        towerHanoi(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 2;
        towerHanoi(n, 'a', 'b', 'c');
//        System.out.println(n,'a','b','c');

    }
    // f(n) = 2^n-1 ;
}