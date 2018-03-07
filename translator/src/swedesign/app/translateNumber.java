package swedesign.app;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class translateNumber {
    public static String Trans(String numGer){
        String[] collection1 = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        ArrayList<String> DE = new ArrayList(Arrays.asList(collection1));
        String[] collection2 = {"eins","zwei","drei","vier","funf","sechts","sieben","achts","neun","zehn"};
        ArrayList<String> EN = new ArrayList(Arrays.asList(collection2));
        //Pair
        HashMap<String,String> DTE= new HashMap<>();
        for (int i=0; i<10;i++){ DTE.put(DE.get(i), EN.get(i));}
        //Translate

        try{
            String result = DTE.get(numGer);
            return result;
        }catch (NullPointerException ex){
            return "ERROR";
        }
    }
}
