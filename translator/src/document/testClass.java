package document;

public class testClass {
    public static void run(){
        TextDocument t1 = new TextDocument("abc",TextDocument.Encoding.UTF8);
        TextDocument t2 = new TextDocument("abc",TextDocument.Encoding.UTF16);
        TextDocument t3 = new TextDocument("abc",TextDocument.Encoding.UTF32);
        complexDocument doc0 = new complexDocument();
        TextDocument doc2 = new TextDocument("The final exam take place soon",TextDocument.Encoding.UTF8);
        doc0.addComponent(doc2);
        complexDocument doc3 = new complexDocument();
        TextDocument doc5 = new TextDocument("Software Engineering Design is a lecture at the VGU",TextDocument.Encoding.UTF32);
        GraficDocument doc4 = new GraficDocument("localhost:8080");
        doc3.addComponent(doc4);
        doc3.addComponent(doc5);
        doc0.addComponent(doc3);
    }
}
