class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!isCharacter(s.charAt(i))) {
                i++;
                continue;
            } else if (!isCharacter(s.charAt(j))) {
                j--;
                continue;
            }
            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));
            if (left == right) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isCharacter(char ch) {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
            return true;
        }

        return false;
    }
}
