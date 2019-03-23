import java.util.ArrayList;
import java.util.HashSet;

public class uniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String code = new String();
            for(int j=0;j<words[i].length();j++){
                int num = (words[i].charAt(j)-'A');
                //System.out.printf("num="+num);
                int number = num - 32;
                //System.out.printf("number="+number);
                code += str[number];
            }
            //System.out.println("code="+code);
            temp.add(code);
        }
        temp = new ArrayList<>(new HashSet<>(temp));
        return temp.size();
    }
    public static void main(String[] args){
        uniqueMorseRepresentations test = new uniqueMorseRepresentations();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(test.uniqueMorseRepresentations(words));
    }
}
