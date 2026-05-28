class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for(int i = 0; i < digits.length; i++){
            str += digits[i];
        }

        long num = Long.parseLong(str);
        num += 1;
        str = Long.toString(num);

        int[] finalX = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int x = Integer.parseInt(str.substring(i, i + 1));
            finalX[i] = x;     
        }

        return finalX;

    }
}
