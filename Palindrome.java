package a;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//int num = 1111111;
//int sum , temp,i,j;
//sum =0;
//temp = num;
//while(num>0) {
//	j= num%10;
//	sum = (sum*10)+j;
//	num= num/10;
//	
//	
//	
//}
//		
//	if(sum==temp) {
//		System.out.println("no is palindrome"+sum);
//	}
//	else {
//		System.out.println("no is  not a palindrome");
//	}
//		
		
//		
//		//print 1 to 100 palindrome
//		
		
int num,i,j,temp;
i=0;

for(num=1;num<=100;num++) {
	temp= num;
	
	while(temp>0) {
		temp=temp%10;
		i= (i*10)+temp;
		temp= temp/10;
		
}

if(num==i) {
	System.out.println("yes "+num);
}
else {
	System.out.println("no"+num);
}
i=0;


}




	


		
		
		
		
	}

	}


