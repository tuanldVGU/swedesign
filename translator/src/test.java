
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexDocunment doc0= new ComplexDocunment();
		TextDocument doc2= new TextDocument("The final exam takes place soon!!",TextDocument.Encoding.UTF8);
		ComplexDocunment doc3= new ComplexDocunment();
		TextDocument doc5= new TextDocument("Software Engineering Design is a lecture at the VGU!", TextDocument.Encoding.UTF32);
		GraficDocument doc4= new GraficDocument("localhost:8080");
		System.out.println("Doc0"+doc0);
		System.out.println("Doc2"+doc2);
		System.out.println("Doc3"+doc3);
		System.out.println("Doc5"+doc5);
		System.out.println("Doc4"+doc4);
		doc3.add(doc5);
		doc3.add(doc4);
		doc0.add(doc2);
		doc0.add(doc3);
		System.out.println("Doc4 size:"+doc4.getSize());
		System.out.println("Doc5 size:"+doc5.getSize());
		System.out.println("Doc3 size:"+doc3.getSize());
		System.out.println("Doc2 size:"+doc2.getSize());
		System.out.println("Doc0 size:"+doc0.getSize());
		//doc0.deleteall();
	//	System.out.println("Doc0 size:"+doc0.getSize());
		doc0.delete(doc2);
		System.out.println("Doc0 size:"+doc0.getSize());
	}

}
