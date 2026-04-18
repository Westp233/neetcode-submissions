class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : sArr) {
            if (Character.isLetterOrDigit(c)) {
                list.add(Character.toLowerCase(c));
            }
        }
        ArrayList<Character> revList = new ArrayList<>(list);
        Collections.reverse(revList);
        return (list.equals(revList));
    }
}
