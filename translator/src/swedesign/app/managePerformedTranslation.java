package swedesign.app;

import java.io.*;
import java.util.ArrayList;

public class managePerformedTranslation {
    public loadPerformedTranslation(){
        InputStream in = new
        for(int i = 0; i < trans.size(); i++) {
            System.out.print(trans.get(i));
        }
    }
    public storePerformedTranslation(ArrayList trans){
        OutputStream out = new FileOutputStream(/Desktops/exp.txt);
        try{
            out.writeObject(trans);
            out.close();
        }
        catch (Exception e){}
    }
}
