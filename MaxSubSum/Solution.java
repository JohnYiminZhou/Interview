/*
求子数组的最大和
题目描述：
输入一个整形数组，数组里有正数也有负数。
数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
求所有子数组的和的最大值。要求时间复杂度为O(n)。
例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，
因此输出为该子数组的和18。

idea: 数组按顺序累加有什么规律？
*/

class Solution{
	public int maxSubArray(int[] a, int n) {
        //保存当前和
        int curSum = 0;
        //最大和
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            //加入下一个元素是否会获得更大的结果，如果更大，子数组连续，否则寻找新数组
            curSum = (a[i] > a[i] + curSum) ? a[i] : a[i] + curSum;
            //保存最大结果
            maxSum = (maxSum > curSum) ? maxSum : curSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = { 1, -5, 4, 6, -3, 9 };
        MaxSubArray maxSubArray = new MaxSubArray();
        System.out.println(maxSubArray.maxSubArray(a, 6));
    }
}