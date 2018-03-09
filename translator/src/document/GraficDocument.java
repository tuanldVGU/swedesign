package document;

public class GraficDocument extends coreDocument {
    private String URL =null;
    public GraficDocument(String x){
        this.URL=x;
    }
    public String getURL(){
        return this.URL;
    }

    @Override
    public int getSize() {
        return 1200;
    }

}
