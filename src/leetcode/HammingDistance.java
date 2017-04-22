/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ¡Ü x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ¡ü   ¡ü

The above arrows point to positions where the corresponding bits are different.
 */
package leetcode;

public class HammingDistance {
	public static int hammingDistance(int x, int y) {
		int num = x^y;
		int count = 0;
		for(int i=0;i<32;i++){
			if((num & 1) == 1){
				count++;
			}
			num = num >> 1;
		}
		return count;
    }
	public static void main(String[] args) {
		System.out.println(hammingDistance(1,4));
	}
}
