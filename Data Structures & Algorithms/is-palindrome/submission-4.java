class Solution {
    public boolean isPalindrome(String s) {
        char[] alphabets = new char[s.length()];
        int len=0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)){
            alphabets[len]=c;
            len++;
            }            
        }
        for (int i = 0; i < len; i++) {
           alphabets[i] = Character.toLowerCase(alphabets[i]);
        }
        boolean flag =true;
        System.out.print(alphabets.length + " " + len);
        int dummy = len;
        for(int i=0;i<len;i++){
            if (alphabets[i]!=alphabets[dummy-1]){ flag = false;
            return flag;
            }
            dummy--;
        }
        return flag;
    }
}
