package document;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class TextDocument extends coreDocument {
    public TextDocument(String abc, Object type) {
        super();
        try {
            this.size = ByteBuffer.wrap(abc.getBytes((String) type)).getInt();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public static class Encoding {
        public static final Object UTF8 = "UTF-8";
        public static final Object UTF16 = "UTF-16";
        public static final Object UTF32 = "UTF-32";
    }
}
