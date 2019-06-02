package Permutations;

/*

Next Permutation

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1


*/
class Solution{
    public void nextPermutation(int[] num){
        int curr = num.length - 1;
        while(curr >0 && num[curr-1] >= num[curr]) curr--;
        reverse(num,curr,num.length - 1);

        if(curr>0){
            int next = curr;
            curr --;
            while(num[curr]>= num[next]) next++;
            swap(num, curr, next);
        }
    }
    private void reverse(int[] num, int start, int end){
        while(start<end){
            swap(num, start++, end--);
        }
    }
    private void swap(int[] num, int a, int b){
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;

    }
}