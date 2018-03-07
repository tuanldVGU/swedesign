package swedesign.app;
import java.util.ArrayList;
import java.util.Random;

public class testClass {
    private static ArrayList<String> results;
    public static void run(){
        testTrans();
        testCRUD();
    }
    private static void testTrans(){
        String result;
        results = new ArrayList<>();
        int count = 0;
        String[] numEn = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","abc","def"};
        String[] numDe = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "achts", "neun", "zehn"};
        Random rand = new Random();

        for(int j = 0; j < 100; ++j) {
            int n = rand.nextInt(10);
            result = translateNumber.Trans(numEn[n]);
            System.out.println("Expected value:" + numDe[n]);
            System.out.println("Real value:" + result);
            results.add("Expected value: "+numDe[n]+", Real value: "+result);
            if (numDe[n].equals(result)) {
                ++count;
            }
        }

        for(int j = 0; j < 100; ++j) {
            int n = rand.nextInt(12);
            result = translateNumber.Trans(numEn[n]);
            System.out.println("Expected value:" + numDe[n]);
            System.out.println("Real value:" + result);
            results.add("Expected value: "+numDe[n]+", Real value: "+result);
            if (numDe[n].equals(result)) {
                ++count;
            }
        }

    }
    private static void testCRUD(){
        managePerformedTranslation test = managePerformedTranslation.getInstance();
        test.storePerformedTranslation(results);
        if (results==test.loadPerformedTranslation()) {
            System.out.println("System perform well");
        }
        else {System.out.println("System error");}

    }
}