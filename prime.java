public class prime {
public static void main(String args []){
	int a;
	int i;
	int count=0;
	System.out.println("enter the number:");
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	for(i=2; i<=num; i++){
	
	
		
		if(a%i==0){
			count++;
		break;
			
		}
	}
		if(count==0){
			System.out.println("this is a prime number");
		}
		else{
		
			System.out.println("this is not a prime number");
		}
	
}
}
