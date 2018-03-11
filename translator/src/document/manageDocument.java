package document;
abstract public class manageDocument implements DocumentObject{
    private int documentID = 0;
    @Override
    public void setID(int x){
        this.documentID = x;
    }

    @Override
    public int getID(){
        return this.documentID;
    }
}
