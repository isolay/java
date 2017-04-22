/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *	Example 1:
 *	Input: "Let's take LeetCode contest"
 *	Output: "s'teL ekat edoCteeL tsetnoc"
 *	Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
package leetcode;

public class ReverseWordsinaStringIII {
	public static String reverseWords(String s) {
		String[] strings = s.split(" ");
		String[] newStrings = new String[strings.length];
		StringBuffer result = new StringBuffer();
		for(int i=0;i<strings.length;i++){
			String str = new StringBuffer(strings[i]).reverse().toString();
			newStrings[i]=str;
		}
		for(String str:newStrings){
			result.append(str+" ");
		}
		return result.toString().trim();
	}
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
