class Main {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0, j = 0;
        while(j<n){
            if(nums[j]==0){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k++;
                j++;
            }
        }
    }
}
