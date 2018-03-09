package document;

import java.util.List;

public class complexDocument extends coreDocument{
    List<coreDocument> components;
    public void addComponent(coreDocument a){
        components.add(a);
    }
    public void deleteComponent(coreDocument a){
        components.remove(a);
    }
    public void deleteAllComponent(){
        components.clear();
    }
    @Override
    public int getSize() {
        return components.size;
    }
}
