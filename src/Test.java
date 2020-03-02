import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Test  {
	static Customer x= new Customer("Default",0);
	public static void main(String[] args){
		Stock stockobj= new Stock();
		ArrayList<Customer> customerAccounts= new ArrayList<Customer>();
		Customer currentCustomer=new Customer("Default",0);
		Scanner input = new Scanner(System.in);
	
		while(true){
		display1();
		int choice = input.nextInt();
		switch(choice){
		case 1:
			//CREATE AN ACCOUNT
			System.out.println("Please enter the username you want to use:");
			String username= input.next();
			boolean accountCreation=false;
			for(Customer m: customerAccounts){
				if(customerAccounts.get(0).getUsername().equals(username)){
					System.out.println("This username is taken!");
					accountCreation=true;
					
					
					break;
				}
			}
			    if(accountCreation==false){
				System.out.println("The username is available!");
				System.out.println("Please enter your password (only using integers!)");
				int password = input.nextInt();
				Customer customer1= new Customer(username,password);
				customerAccounts.add(customer1);
				currentCustomer=customer1;
				x=currentCustomer;
				
				display2();
				
				int choice2= input.nextInt();
				switch(choice2){
				case 1:
					display3();
					int choice3=input.nextInt();
					switch(choice3){
					case 1:
						//System.out.println(currentCustomer);
						System.out.println("***You want to buy lipstick***");
						System.out.println("Which brand (NYX,Essence,MAC)");
						String brand= input.next();
						System.out.println("Which Color? (Pink or Red?)");
						String color = input.next();
						System.out.println("Which type (Gloss or Matte?)");
						String type=input.next();
						Lipstick obj= new Lipstick();
						
						if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.NYXPinkGloss.get(0);
							stockobj.NYXPinkGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.NYXPinkGloss.get(0));
						}
						if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.NYXPinkMatte.get(0);
							stockobj.NYXPinkMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.NYXPinkMatte.get(0));
						}
						if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.NYXRedGloss.get(0);
							stockobj.NYXRedGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.NYXRedGloss.get(0));
						}
						if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.NYXRedMatte.get(0);
							stockobj.NYXRedMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.NYXRedMatte.get(0));
						}
						
						
						if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.EssencePinkGloss.get(0);
							stockobj.EssencePinkGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.EssencePinkGloss.get(0));
						}
						if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.EssencePinkMatte.get(0);
							stockobj.EssencePinkMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.EssencePinkMatte.get(0));
						}
						if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.EssenceRedGloss.get(0);
							stockobj.EssenceRedGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.EssenceRedGloss.get(0));
						}
						if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.EssenceRedMatte.get(0);
							stockobj.EssenceRedMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.EssenceRedMatte.get(0));
						}
						
					
						if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.MACPinkGloss.get(0);
							stockobj.MACPinkGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.MACPinkGloss.get(0));
						}
						if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.MACPinkMatte.get(0);
							stockobj.MACPinkMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.MACPinkMatte.get(0));
						}
						if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
							stockobj.MACRedGloss.get(0);
							stockobj.MACRedGloss.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.MACRedGloss.get(0));
						}
						if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
							stockobj.MACRedMatte.get(0);
							stockobj.MACRedMatte.remove(0);
							System.out.println("Buying the product...");
							currentCustomer.Buy(stockobj.MACRedMatte.get(0));
						}
						
						
	
					}
					break;
				case 2:
					System.out.println("You want to return a product");
					display4();
					int choice4=input.nextInt();
					switch(choice4){
					case 1:
						currentCustomer.returnLipstick(stockobj);
						break;
					case 2:
						System.out.println("You want to return a shadow!");
						System.out.println("Our eyeshadow stock is not completed,please try another time!");
						break;
					}
				case 3:
					System.out.println("You want to skim through the sales!");
					sales();
					break;
					default:
						System.out.println("inappropriate entry");
						break;
	
			}
			 
			    }
		
					break;
			case 2:	
				boolean accountAccess=false;
				System.out.print("Enter your username:");
				String takenUsername= input.next();
				System.out.print("Enter your password:");
				int takenPassword= input.nextInt();
				for(int i=0;i<customerAccounts.size();i++){
					if(customerAccounts.get(i).getUsername().equals(takenUsername)&&customerAccounts.get(i).getPassword()==takenPassword){
						System.out.println("You have accesed your account!");
						accountAccess=true;
						customerAccounts.get(i).setAccountID(i);
						currentCustomer=customerAccounts.get(i);
						x=currentCustomer;
					}
				}
				if(accountAccess==false){
					System.out.println("Access denied!");
					break;
				}
						display2();
						int choice2= input.nextInt();
						switch(choice2){
						case 1:
							display3();
							int choice3=input.nextInt();
							switch(choice3){
							case 1:
								//System.out.println(currentCustomer);
								System.out.println("***You want to buy lipstick***");
								System.out.println("Which brand (NYX,Essence,MAC)");
								String brand= input.next();
								System.out.println("Which Color? (Pink or Red?)");
								String color = input.next();
								System.out.println("Which type (Gloss or Matte?)");
								String type=input.next();
								//Lipstick obj= new Lipstick();
								
								if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.NYXPinkGloss.get(0);
									stockobj.NYXPinkGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.NYXPinkGloss.get(0));
								}
								if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.NYXPinkMatte.get(0);
									stockobj.NYXPinkMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.NYXPinkMatte.get(0));
								}
								if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.NYXRedGloss.get(0);
									stockobj.NYXRedGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.NYXRedGloss.get(0));
								}
								if(brand.equalsIgnoreCase("NYX")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.NYXRedMatte.get(0);
									stockobj.NYXRedMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.NYXRedMatte.get(0));
								}
								
								
								if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.EssencePinkGloss.get(0);
									stockobj.EssencePinkGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.EssencePinkGloss.get(0));
								}
								if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.EssencePinkMatte.get(0);
									stockobj.EssencePinkMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.EssencePinkMatte.get(0));
								}
								if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.EssenceRedGloss.get(0);
									stockobj.EssenceRedGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.EssenceRedGloss.get(0));
								}
								if(brand.equalsIgnoreCase("Essence")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.EssenceRedMatte.get(0);
									stockobj.EssenceRedMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.EssenceRedMatte.get(0));
								}
								
							
								if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.MACPinkGloss.get(0);
									stockobj.MACPinkGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.MACPinkGloss.get(0));
								}
								if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Pink")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.MACPinkMatte.get(0);
									stockobj.MACPinkMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.MACPinkMatte.get(0));
								}
								if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Gloss")==true){
									stockobj.MACRedGloss.get(0);
									stockobj.MACRedGloss.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.MACRedGloss.get(0));
								}
								if(brand.equalsIgnoreCase("MAC")==true&&color.equalsIgnoreCase("Red")==true&&type.equalsIgnoreCase("Matte")==true){
									stockobj.MACRedMatte.get(0);
									stockobj.MACRedMatte.remove(0);
									System.out.println("Buying the product...");
									currentCustomer.Buy(stockobj.MACRedMatte.get(0));
								}
								
								break;
					
						case 2:
							System.out.println("You want to buy eyeshadow but we don't have them in our stock yet!");
							break;
						default:
							System.out.println("Inappropriate!");
							break;
							}	
							break;
						case 2:
							System.out.println("You want to return a product");
							display4();
							
							int choice4=input.nextInt();
							switch(choice4){
							case 1:
								currentCustomer.returnLipstick(stockobj);
								break;
							case 2:
								System.out.println("Return eyeshadow");
								break;
								
							default:
								System.out.println("inappropriate entry");
								break;

						}
							break;
						case 3:
							System.out.println("You want to skim through the sales!");
							sales();
							break;
						}

				break;
			case 3:
				System.exit(0);
		break;
		
			case 4:
				for(Customer m: customerAccounts){
					System.out.println(m);
				}
				break;
			case 5:
				System.out.println("You want to delete an account!");
				System.out.print("The username you want to delete? :");
				String deleteAcc=input.next();
				boolean accountFound=false;
				for(int i=0;i<customerAccounts.size();i++){
					if(customerAccounts.get(i).getUsername().equalsIgnoreCase(deleteAcc)==true){
						accountFound=true;
						System.out.println("Password?");
						int deleteAccPass=input.nextInt();
						if(customerAccounts.get(i).getPassword()==deleteAccPass){
							customerAccounts.remove(i);
							break;
						}
					}
				}
				if(accountFound=false){
					System.out.println("Account does not exist!");
					break;
				}
				break;
			case 6:
				
				stockobj.displayTheStock();
		}
	
		
		
		
		}
		

		}
	public static void sales(){
		if(x.theTotalAmountPaid>20){
			System.out.println("You have %5 sale on your next shopping!");
		}
		
		if(x.theTotalAmountPaid>50&&x.theTotalAmountPaid<100){
			System.out.println("You have %10 sale on your next shopping!");
		}
		if(x.theTotalAmountPaid>=100&&x.theTotalAmountPaid<200){
			System.out.println("You have %15 sale on your next shopping!");
		}
		if(x.theTotalAmountPaid>=200){
			System.out.println("You have %20 sale on your next shopping!");
		}
		else{
			System.out.println("THE MORE YOU BUY THE CHEAPER YOU BUY :)");
		}
	}

	public static void display1(){
		System.out.println("Welcome to Melo Cosmetics!");
		System.out.println("'Press 1 to create an account");
		System.out.println("'Press 2 to sign in your account");
		System.out.println("'Press 3 to leave the program");
		System.out.println("'Press 4 to display all the customers");
		System.out.println("'Press 5 to delete a customer account");
		System.out.println("'Press 6 to display the stocks");
		System.out.print("Your choice?");
	}
	public static void display2(){
		System.out.println("'Press 1 buy products!");
		//System.out.println("Press 2 to pay");
		System.out.println("'Press 2 to return the product");
		System.out.println("'Press 3 to skim through the sales");
		System.out.print("'Your choice?");
	}
	public static void display3(){
		System.out.println("'Press 1 to buy lipstick");
		System.out.println("'Press 2 to buy Eyeshadow");
		System.out.print("Your choice?");	
	}
	public static void display4(){
		System.out.println("'Press 1 to return lipstick");
		System.out.println("'Press 2 to return eyeshadow");
		
	}
	
	
}




