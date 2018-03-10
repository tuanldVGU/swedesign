public abstract interface DocumentObject {

default void print(String str) {
	if (str!=null)
		System.out.println("MyData Print::" + str);
}

public default int getSize() {
	return 0;};

	
ManageDocument abc= new ManageDocument();		
}
