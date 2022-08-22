//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
//
// Related Topics 数组 双指针 👍 1707 👎 0

package leetcode.editor.cn;
public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
    
    }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length < 2){
            return;
        }
        //1.构造两个指针 l , r 其中l左边全是非0数
        // r为用来遍历的指针
        int l = 0;int r = 0;
        int len = nums.length;
        //2.开始循环
        while(r < len){
            if(nums[r] != 0){
                swap(nums,l,r);
                l++;
            }
            r++;
        }

    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//1.loop,count,zeros
//2.开一个新数组，如果非0放到新数组中，为0则跳过
//3.国际站上有些人的代码并没有swap操作，而是把当前非零值赋给下一个