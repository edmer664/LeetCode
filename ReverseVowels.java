public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int pointer1 = 0;
        int pointer2 = str.length -1;
        while(pointer2 >= pointer1 ){
            if(isVowel(str[pointer1]) && isVowel(str[pointer2])){
                char temp = str[pointer1];
                str[pointer1] = str[pointer2];
                str[pointer2] = temp;
                pointer1++;
                pointer2--;
                continue;
            }
            if(!isVowel(str[pointer1] )){
                pointer1++;
            }
            if(!isVowel(str[pointer2] )){
                pointer2--;
            }
        }

        return new String(str);

    }

    private boolean isVowel(char c) {
        char[] vowels = {'a','e','i','o','u'};
        char lowercased = Character.toLowerCase(c);
        for (char d : vowels) {
            if(d == lowercased){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ReverseVowels app = new ReverseVowels();
        System.out.println(app.reverseVowels("leetcode"));
    }
}