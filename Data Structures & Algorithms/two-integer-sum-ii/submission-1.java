class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        int[] finalTwo = new int[2];


        for (int i = 0; i < numbers.length; i++) {
            seen.put(numbers[i], i + 1);
            int x = target - numbers[i];

            if (seen.containsKey(x)) {
                finalTwo[0] = Math.min(seen.get(x), seen.get(numbers[i]));
                finalTwo[1] = Math.max(seen.get(x), seen.get(numbers[i]));
            }

        }

        return finalTwo;
        
    }
}
