class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean flag = true;
        if (a.length != b.length) return false;
        int i=0;
        while(i<a.length){
            if(a[i]!=b[i]){
                flag=false;
                break;
            }
            i++;
        }
        return flag;
    }
}
