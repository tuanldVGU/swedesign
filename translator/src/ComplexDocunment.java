import java.util.ArrayList;

public class ComplexDocunment extends ManageDocument implements DocumentObject{
	DocumentObject component;
	private  ArrayList<DocumentObject> arr= new ArrayList<DocumentObject>();
	public void delete(DocumentObject a)
	{int i=arr.size();
	System.out.println("Doc before delete:"+arr);
	for(int j=0;j<i;j++)
		{if(a.equals(arr.get(j)))
			{arr.remove(a);
			System.out.println("Doc after delete:"+arr);
			System.out.println("Deleted document!!!");
			break;}
		else{System.out.println("Document not found in the storage!!!");}}}
	public void add(DocumentObject b)
	{arr.add(b);
	System.out.println("Doc:"+arr);
	System.out.println("Store Successfull!!");}
	public void deleteall() 
	{	System.out.println("Doc before delete:"+arr);
		int i= arr.size();
		for(int j=0;j<i;j++)
			{arr.remove(0);	}
		System.out.println("Doc after delete:"+arr);
		System.out.println("Delete all document!!!");}
	public int getSize() 
	{int sum=0;
	int j=arr.size();
	//System.out.println("Arr"+arr);
	for(int i=0;i<j;i++)
		{ sum=sum+arr.get(i).getSize();
		}
	return sum;}
}
