/*
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。

例如，

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
    
示例 1:
输入: 1
输出: "A"

示例 2:
输入: 28
输出: "AB"

示例 3:
输入: 701
输出: "ZY"



给定一个Excel表格中的列名称，返回其相应的列序号。

例如，

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
    
示例 1:
输入: "A"
输出: 1

示例 2:
输入: "AB"
输出: 28

示例 3:
输入: "ZY"
输出: 701
*/
package lianxi0223;

public class test0223 {
	public static void main(String[] args) {
		Solution S = new Solution();
		/*int n = 56;
		String s = S.convertToTitle(n);
		System.out.println(s);*/
		String s = "AD";
		int a = S.titleToNumber(s);
		System.out.println(a);
	}
}

/*class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            if(n%26==0){
                sb.append('Z');
                n -= 26;
            }else {
                sb.append((char) ('A' + (n % 26) - 1));
            }
            n /= 26;
        }
        return sb.reverse().toString();
    }
}*/

class Solution {
    public int titleToNumber(String s) {
        int a =0;
        char[] chars = s.toCharArray();
        for(int i = 0; i<chars.length; i++)
        {
            a=a*26+(int)chars[i]-64;
        }
        return a;
    }
}
