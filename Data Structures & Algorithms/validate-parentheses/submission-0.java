class Solution {
    public boolean isValid(String s) {
        String x = s;
        while(x.contains("()") || x.contains("[]") || x.contains("{}")) {
            x = x.replace("()", "");
            x = x.replace("{}", "");
            x = x.replace("[]", "");
        }

        return x.length() == 0;


    }
}
