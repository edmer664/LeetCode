/**
 * IsSubseq
 */
public class IsSubseq {

    public boolean isSubsequence(String s, String t) {
        if(t.length() < s.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int matches = 0;
        for(int i =0; i<t.length(); i++){
            if(matches <= s.length() && s.charAt(matches) == t.charAt(i) ){
                matches++;
            }
        }
        return matches == s.length();
        

    }
    public static void main(String[] args) {
        IsSubseq a = new IsSubseq();
        System.out.println(a.isSubsequence("a", "abc"));
    }
}