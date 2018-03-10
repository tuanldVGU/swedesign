public class TextDocument extends CoreDocument {
	public String s;
	public String  e;
	public enum Encoding {
		UTF8,UTF16,UTF32} Encoding enc;
	public void Enco() 
	{
		switch(enc) {
		case UTF8:
		{String out;
		try{out=new String(e.getBytes("UTF-8"),"ISO-8859-1");}
		catch(Exception e) {System.out.println(e);
		out=null;}
		s=out;}
		break;
		case UTF16:
		{String out;
		try{out=new String(e.getBytes("UTF-16"),"ISO-8859-1");}
		catch(Exception e) {System.out.println(e);
		out=null;}
		s=out;}
		break;
		case UTF32:
		{String out;
		try{out=new String(e.getBytes("UTF-32"),"ISO-8859-1");}
		catch(Exception e) {System.out.println(e);
		out=null;}
		s=out;}
		break;
		default: break;}}
	
	public void Store(String s)
	{System.out.println(s);}
	public int getSize() {return 1;}
	public TextDocument(String e, TextDocument.Encoding a) {};

}
