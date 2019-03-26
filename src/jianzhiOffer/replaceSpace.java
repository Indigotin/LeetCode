package jianzhiOffer;

/**
 * Created by Len on 2019-03-25
 */
public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        String rep = "%20";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str.replace(i,i+1,rep);
            }
        }
        return str.toString();
    }
}
