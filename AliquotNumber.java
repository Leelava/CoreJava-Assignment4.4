package Session4Assignment4;

import java.util.Scanner;

public class AliquotNumber {
public int aliquotnum(int num)
{
	
	int sum=0;
	
	for (int i=1; i<= num/2; i++ )
	{
		if ((num%i)==0)
		{
			sum= sum+i;
		
		}
	}
	return sum;
		
	}
public void perfectnum()
{System.out.println("The perfect numbers between 1 to 100 are");
	
	for (int i =1; i<=100; i++){
		int sum =aliquotnum(i);
		if (sum==i){
			System.out.println( +i);}
	
}


}

}
	

