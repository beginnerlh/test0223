/*
 * ����һ������������������ Excel �������Ӧ�������ơ�

���磬

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
    
ʾ�� 1:
����: 1
���: "A"

ʾ�� 2:
����: 28
���: "AB"

ʾ�� 3:
����: 701
���: "ZY"



����һ��Excel����е������ƣ���������Ӧ������š�

���磬

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
    
ʾ�� 1:
����: "A"
���: 1

ʾ�� 2:
����: "AB"
���: 28

ʾ�� 3:
����: "ZY"
���: 701
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
