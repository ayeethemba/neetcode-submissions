class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        
        
        for (int k = 0; k < nums.length; k++) {
            int left = k + 1;
            int right = nums.length - 1;

            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == -nums[k]) {
                    result.add(Arrays.asList(nums[k], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                }

                else if (sum < -nums[k]) {
                    left++;
                }
                else if (sum > -nums[k]) {
                    right--;
                }

            }

        }
        return result;
    }
}
