package leetcode.easy;

/**
 * @author chen_wj
 * @Description:
 * @date 2021/2/15
 * @Description: 给定一个二进制数组， 计算其中最大连续1的个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,1,0,1,1,1]
 * 输出: 3
 * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
 * 注意：
 * <p>
 * 输入的数组只包含 0 和1。
 * 输入数组的长度是正整数，且不超过 10,000。
 * @modifier
 */
public class Max_Consecutive_Ones {


	public static void main(String[] args) {
		int[] arr = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}


	public static int findMaxConsecutiveOnes(int[] nums) {
		int last = 0;
		int current = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				current++;
			} else {
				last = last >= current ? last : current;
				current = 0;
			}
		}
		return last >= current ? last : current;
	}

}
