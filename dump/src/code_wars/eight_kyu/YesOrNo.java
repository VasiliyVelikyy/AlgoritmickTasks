package code_wars.eight_kyu;

public class YesOrNo {
    public static String boolToWord(boolean b) {
        String retVal = "";
        if(b)retVal="Yes";
        if(!b) retVal="No";
        return retVal;
    }
}