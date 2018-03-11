package document;

import java.util.ArrayList;
import java.util.List;

public class complexDocument extends manageDocument{
    List<DocumentObject> components = new ArrayList<DocumentObject>();
    public void addComponent(DocumentObject a){
        System.out.println("yes");
        components.add(a);
    }
    public void deleteComponent(DocumentObject a){
        components.remove(a);
    }
    public void deleteAllComponent(){
        components.clear();
    }
    @Override
    public int getSize() {
        int ans=0;
        for (int i=0;i<components.size();i++){
            ans+=components.get(i).getSize();
        }
        return ans;
    }
}
