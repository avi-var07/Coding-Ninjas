/*Problem statement
Given an integer ‘n’, return first n Fibonacci numbers using a generator function.



Example:
Input: ‘n’ = 5

Output: 0 1 1 2 3

Explanation: First 5 Fibonacci numbers are: 0, 1, 1, 2, and 3.
Note:
You don't need to print anything. Just implement the given function.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
Sample Output 1:
0 1 1 2 3
Explanation Of Sample Input 1:
The first 5 Fibonacci numbers are 0, 1, 1, 2, and 3.
Sample Input 2:
3
Sample Output 2:
0 1 1
Explanation Of Sample Input 2:
The first 5 Fibonacci numbers are 0, 1, 1.
Expected time complexity
The expected time complexity is O(n).
Constraints:
1 <= n <= 45
Time Limit: 1 s */

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int result[] = generateFibonacciNumbers(n);
        for(int ele: result)
        System.out.print(ele+" ");
        
        
        sc.close();
    }
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] ans = new int[n];

        if (n >= 1) ans[0] = 0;
        if (n >= 2) ans[1] = 1;

        int t1 = 0, t2 = 1, t3;
        for (int i = 2; i < n; i++) {
            t3 = t1 + t2;
            ans[i] = t3;
            t1 = t2;
            t2 = t3;
        }

        return ans;
    }
}