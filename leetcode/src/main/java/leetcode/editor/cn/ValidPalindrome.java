//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// 字符串 s 由 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 563 👎 0

package leetcode.editor.cn;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        boolean res = false;
        //去除掉字符串中的非数字和字母
        String filteredS = removeNonNumberAndChar(s);
        //翻转字符串
        String reversedS = reverseString(filteredS);
        //忽略大小写进行比较
        res = reversedS.equalsIgnoreCase(filteredS);

        return res;
    }

    private String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * remove all nonalphanumeric(字符串中的非数字和字母)
     * @param s
     * @return
     */
    private String removeNonNumberAndChar(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
