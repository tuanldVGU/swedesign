package swedesign.app;

import java.io.*;
import java.util.ArrayList;

public class managePerformedTranslation {
    private static managePerformedTranslation instance = null;

    public ArrayList<String> loadPerformedTranslation(){
        ArrayList<String> ans = null;
        try
        {
            FileInputStream inpf = new FileInputStream("~\\Desktops\\exp.txt");
            ObjectInputStream in = new ObjectInputStream(inpf);
            ans = (ArrayList<String>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return ans;
    }

    public void storePerformedTranslation(ArrayList trans){
        try {
            FileOutputStream outf = new FileOutputStream("~\\Desktops\\exp.txt");
            ObjectOutputStream out = new ObjectOutputStream(outf);
            out.writeObject(trans);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static managePerformedTranslation getInstance() {
        if(instance == null) {
            instance = new managePerformedTranslation();
        }
        return instance;
    }

}
