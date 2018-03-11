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
        System.out.println("Doc0"+doc0);
        System.out.println("Doc2"+doc2);
        System.out.println("Doc3"+doc3);
        System.out.println("Doc5"+doc5);
        System.out.println("Doc4"+doc4);
        System.out.println("Doc4 size:"+doc4.getSize());
        System.out.println("Doc5 size:"+doc5.getSize());
        System.out.println("Doc3 size:"+doc3.getSize());
        System.out.println("Doc2 size:"+doc2.getSize());
        System.out.println("Doc0 size:"+doc0.getSize());
        //doc0.deleteall();
        //	System.out.println("Doc0 size:"+doc0.getSize());
        //doc0.deleteComponent(doc2);
        System.out.println("Doc0 size:"+doc0.getSize());
    }
}
