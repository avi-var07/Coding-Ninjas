/*Problem statement
As a part of its competition, the school will conduct a codeathon, Lock the Code, where it has been given a value, and the participants have to decode it.

The participants are given a value denoting the number of rows in the matrix; they need to print the pattern.

Example : 

For N=5, Pattern:
E
DE
CDE
BCDE
ABCDE 
Among the participants, Ninja is new to programming and doesn’t have much experience; he asks you to solve the problem. Can you help solve this problem?

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 50
1 <= N <= 26

Time Limit: 1 sec
Sample Input 1:
2
5
4
Sample Output 1:
E
DE
CDE
BCDE
ABCDE

D
CD
BCD
ABCD
Explanation for Sample Input 1:
In the first test case, value of ‘N’ is 5, so print the ‘N’ rows from 1 to ‘N’ where in each row start from (N - i - 1)the character which goes on till ‘Nth character. Hence the answer is [‘E’,’DE’,’CDE,’ BCDE’,’ABCDE’].

In the second test case, the value of ‘N’ is 4, so print the ‘N’ rows from 1 to ‘N’ where each row starts from (N - i - 1)the character, which goes on till ‘Nth character. Hence the answer is [‘D’,’CD’,BCD’,’ABCD’].
Sample Input 2:
2
3
2
Sample Output 2:
C
BC
ABC

B
AB */

import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        
        ArrayList<ArrayList<Character>> ans = interestingPattern(n);

        for(ArrayList<Character> ele: ans)
        System.out.print(ele+" ");

        sc.close();
    }
    public static ArrayList<ArrayList<Character>> interestingPattern(int N) {

		// Write your code here.
		ArrayList<ArrayList<Character>> ans = new ArrayList<>();

		for(int i = 0; i<N;i++){
			char start  = (char)('A'+N-1-i);

			ArrayList<Character> row = new ArrayList<>();

			for(char ch = start; ch<='A'+N-1;ch++)
			row.add(ch);

			ans.add(row);

			
		}
		return ans;
	}
}