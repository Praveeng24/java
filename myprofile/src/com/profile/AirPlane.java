package com.profile;
	import java.util.Scanner;
	public class AirPlane {
		
		  public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int f=0;
			int e=5;
			int exit;
			
			do{
			System.out.println("AIRLINE RESERVATION SYSTEM");
			System.out.println("\t\tPLEASE CHOOSE:");
			System.out.println("\t\t1. FIRST CLASS");
			System.out.println("\t\t2. ECONOMY");
			int section=input.nextInt();
			
			
			switch(section){
				case 1:
						System.out.println(" FIRST CLASS SECTION.");			
						f++;
						if (f<=5){
							
						System.out.println("Your seat number is "+f);
						System.out.println();
						}
						
						else{
							System.out.println("The first class section is full.");
							System.out.println("Do you want to book ticketin economy section?(1.yes\t2.no)");
							int full=input.nextInt();
							if (full==1){
							System.out.println("Press 1 to go to the main menu.");
							}
							else{
								System.out.println("next flight leaves in 3 hours.");
							}
						}
						break;
			case 2:
				System.out.println();
					System.out.println("YOUR ARE IN ECONOMY SECTION.");			
						e++;
						if ((e>5)&&(e<=10)){
							
						System.out.println("Your seat number is "+e);
						System.out.println();
						}
						
						else{
					
							System.out.println("The economy class section is full.");
							System.out.println("Do you want to be placed at the first class section?(1.yes\t2.no)");
							int full=input.nextInt();
							if (full==1){
							System.out.println("Press 1 to go to the main menu.");
							}
							else{
								System.out.println("next flight leaves in 3 hours.");
							}
						}
						
						
			}
			System.out.println();
			System.out.println("1.main menu\t2.exit");
			exit=input.nextInt();
		  }while (exit==1);
		  System.out.println();
		  System.out.println("Enjoy your journey!");
		}
		}
