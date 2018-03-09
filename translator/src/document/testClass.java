package document;

public class testClass {
    public static void run(){
        TextDocument t1 = new TextDocument("abc",TextDocument.Encoding.UTF8);
        TextDocument t2 = new TextDocument("abc",TextDocument.Encoding.UTF16);
        TextDocument t3 = new TextDocument("abc",TextDocument.Encoding.UTF32);
    }
}
