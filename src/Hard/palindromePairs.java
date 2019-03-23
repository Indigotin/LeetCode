package Hard;

import java.util.*;

/**
 * Created by Len on 2019-03-16
 */
public class palindromePairs {


    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> list = new LinkedList<>();

        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],i);
        }


        for(int i=0;i<words.length;i++){
            int l = 0;
            int r = 0;
            while(l <= r){
                String str = words[i].substring(l,r);
                Integer j = map.get(new StringBuilder(str).reverse().toString());
                if(j != null && i != j &&
                        isPalindrome(words[i].substring(l == 0 ? r : 0, l == 0 ? words[i].length() : l))){

                    list.add(Arrays.asList(l == 0 ? new Integer[]{i, j} : new Integer[]{j, i}));
                }
                if (r < words[i].length()) r++;
                else l++;
            }
        }

        return list;
    }


    private boolean isPalindrome(String str){

        for(int i=0; i < str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        String[] words = {"abcd","dcba","lls","s","sssll"};
        palindromePairs test = new palindromePairs();
        List<List<Integer>> list = test.palindromePairs(words);
        System.out.print(list);
    }
}
