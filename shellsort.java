import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int []arr=new int[]{100,10,20,40,90,50,80,70,60};
		int gap,i,j,temp;
		for(gap=arr.length/2;gap>0;gap/=2)
		{
		    for(i=gap;i<arr.length;i++)
		    {
		        temp=arr[i];
		        for(j=i;j>=gap&&arr[j-gap]>temp;j-=gap)
		        {
		            arr[j]=arr[j-gap];
		        }
		        arr[j]=temp;
		    }
		}
		
	  for(int k=0;k<arr.length;k++)
	  {
	      System.out.print(arr[k]);
	  }
	  
	}
}
