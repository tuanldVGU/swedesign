package swedesign.app;
import java.util.Random;

public class testClass {

    public static void run(){
        testTrans();
        testCRUD();
    }
    private static void testTrans(){
        String result;
        int count = 0;
        String[] numEn = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] numDe = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "achts", "neun", "zehn"};
        Random rand = new Random();

        for(int j = 0; j < 1000; ++j) {
            int n = rand.nextInt(10);
            result = translateNumber.Trans(numEn[n]);
            System.out.print("Expected value:" + numDe[n]);
            System.out.print("        ");
            System.out.println("Real value:" + result);
            if (numDe[n].equals(result)) {
                ++count;
            }
        }

        String t = "abc";
        result = translateNumber.Trans(t);
        System.out.print("Expected value:Error!");
        System.out.print("        ");
        System.out.println("Real value:" + result);
        if (result.equals("Error!")) {
            ++count;
        }

        if (count == 1001) {
            System.out.print("All test successfull!!");
        }
    }
    private static void testCRUD(){

    }
}