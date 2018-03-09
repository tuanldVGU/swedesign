package document;

import java.util.List;

public class complexDocument extends manageDocument{
    List<DocumentObject> components;
    public void addComponent(DocumentObject a){
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
