
public class OutOfMemoryTest {
	int arr[];
	OutOfMemoryTest()
	{
		arr = new int[2000000];
	}
	
	public static void main(String args[]){
		try{
			OutOfMemoryTest ot[] = new OutOfMemoryTest[2000];
			for(int i =0; i<ot.length; i++)
			{
				ot[i] = new OutOfMemoryTest();
			}
		
	}catch(Throwable t)
		{
		System.out.println("catch" +t);
		}

}
}
