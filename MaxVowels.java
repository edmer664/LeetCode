public class MaxVowels {
    public int maxVowels(String s, int k) {
        int maxCount = countVowels(s.substring(0,k)); 
        int windowCount = maxCount;
        char firstChar = s.charAt(0);
        for(int i = 0; i < s.length() - k ; i++){
            if(isVowel(firstChar)){
                windowCount = maxCount - 1;
            }
            char lastChar = s.charAt(i + k);
            if(isVowel(s.charAt(i + k))){
                windowCount++;
            }

            maxCount = Math.max(maxCount, windowCount);
            firstChar = s.charAt(i + 1);
        }
        return maxCount;
    }

    private int countVowels(String s){
        int counter= 0;
        for(int i = 0; i < s.length(); i++){
            if (isVowel(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    private boolean isVowel(char c){
        char[] vowels = new char[]{'a','e','i','o','u'};
        for(int i = 0; i<vowels.length; i++){
            if(c==vowels[i]){return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        MaxVowels m = new MaxVowels();
        System.out.println(m.maxVowels("leetcode", 3));
    }
}
