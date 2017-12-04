package utils;

/**
 * Created by Tlegen on 05.12.2017.
 */
public class CommonStringUtils {

    public String reverse(String input){
        int strLength = input.length();
        char[] inpStrToChars = input.toCharArray();
        for(int i=0; i<strLength / 2; i++){
            inpStrToChars[i] = input.charAt(strLength-1-i);
            inpStrToChars[strLength-1-i] = input.charAt(i);
        }
        return new String(inpStrToChars);
    }

    public String reverseBaseJavaMethod(String input){
        StringBuilder inputSb = new StringBuilder(input);
        return inputSb.reverse().toString();
    }
}
