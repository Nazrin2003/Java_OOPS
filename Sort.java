public class Sort{
	public static void main(String []args){
		int i,j;
		String[] arr={"do","your","best","at"};
		System.out.println("Array values :");
		for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+"\t");
		}
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
			    if(arr[i].compareTo(arr[j]) > 0)
			    {
				    String temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
			    }
			}
		}	
		System.out.println("\nSorted array :");
		for(i=0;i<arr.length;i++)
		{
		    System.out.print(arr[i]+"\t");
		}
        System.out.println("\n");
}
}

