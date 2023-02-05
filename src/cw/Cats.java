package cw;

/* An infinite number of shelves are arranged one above the other in a staggered fashion.
* The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3.
* The cat cannot climb on the shelf directly above its head.
* Input: Start and finish shelf numbers (always positive integers, finish no smaller than start)
* Task: Find the minimum number of jumps to go from start to finish
 */

public class Cats {
    public static void main(String[] args) {
        System.out.println(jumpCounter(1, 5));
        System.out.println(jumpCounter(1, 7));
        System.out.println(jumpCounter(1, 6));
        System.out.println(jumpCounter(1, 14));
    }

    public static int jumpCounter(int start, int finish) {
        return (finish - start) / 3 + (finish - start) % 3;
    }
}
