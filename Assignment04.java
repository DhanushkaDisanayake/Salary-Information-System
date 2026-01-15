import java.util.*;
class Assignment04{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("|                     SALARY INFORMATION SYSTEM                        |");
		System.out.println("------------------------------------------------------------------------\n");
		
		System.out.println("		[1] Calculate Income Tax");
		System.out.println("		[2] Calculate Annual Bonus");
		System.out.println("		[3] Calculate Loan amount\n");
		
		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
		System.out.println("\n\n\n\n");
		
		switch(option){
			
			case 1 :
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|                     Calculate Income Tax                             |");
				System.out.println("------------------------------------------------------------------------\n");

				System.out.print("Input Employee name    : ");
				String en = input.next();
				System.out.println();
				System.out.print("Input Employee salary  : ");
				double es = input.nextInt();
				System.out.println();
				double it = 00;
				
				if (es<100000){
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else if ( es > 100000 && es <= 141667){
					it = ((es-100000)*0.06);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else if ( es > 141667 && es <= 183333){
					it = Math.round(((es-141667)*0.12 )+ 2500);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else if ( es > 183333 && es <= 225000){
					it = Math.round(((es-183333)*0.18)+ 7500);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else if ( es > 225000 && es <= 266667){
					it = Math.round(((es-225000)*0.24)+ 15000);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else if ( es > 266667 && es <= 308333){
					it = Math.round(((es-266667)*0.30)+ 25000);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}else {
					it = Math.round(((es-308333)*0.36)+37500);
					System.out.printf("You have to pay Income Tax per month : %.2f",it);
				}
				break;
		
			case 2:
		  
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|                     Calculate Annual Bonus                           |");
				System.out.println("------------------------------------------------------------------------");
				System.out.println();
		
				System.out.print("Input Employee name      : ");
				String en2 = input.next();
				System.out.println();
				System.out.print("Input Employee salary    : ");
				double es2 = input.nextDouble();
				System.out.println();
				double b;		
		
				if(100000>es2){
					b = 5000;
					System.out.println("Annual bonus "+b);
				}else if(100000<=es2 && es2<=199999){
					b = es2*0.1;
					System.out.println("Annual bonus "+b);
				}else if(200000<=es2 & es2<=299999){
					b = es2*0.15;
					System.out.println("Annual bonus "+b);
				}else if(300000<=es2 & es2<=399999){
					b = es2*0.2;
					System.out.println("Annual bonus "+b);
				}else{
					b = es2*0.35;
					System.out.println("Annual bonus "+b);
				}     
			
			break;
		
			case 3:
			
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|                     Calculate Loan amount                            |");
				System.out.println("------------------------------------------------------------------------");
				System.out.println();
		
				System.out.print("Input Employee name       : ");
				String en3 = input.next();
				System.out.println();
				System.out.print("Input Employee salary     : ");
				double es3 = input.nextDouble();
				System.out.println();
		
				if(es3<50000){
					System.out.println();
					System.out.println("		You can not get a loan because your salary lessthan Rs.50 000...");
				}else{
			
				System.out.print("Input number of year  : ");
				double y = input.nextDouble();
		
				if(y>5){
					System.out.println();
					System.out.println("		The maximum number of years of the year is 5");
				}else{
					
					double n = y*12;
					double r = 0.15;
					double mi = es3*0.6;
					double x = Math.pow(1+(r/12), n);
					double la = Math.round(mi*(1-(1 /x))/(r/12));
					System.out.println();
					System.out.printf("You can get Loan Amount : "+la);
				}
			}
					break;
				
				default:
					System.out.println("Invaild option. please select 1,2 or 3 )");
		}
	}
}			

