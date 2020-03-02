import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private String username;
	private int password;
	private int accountID;
	double amountToPay=0; 
	double theTotalAmountPaid=0;
	ArrayList<Products> BoughtProducts = new ArrayList<Products>();
	Stock stockobj2= new Stock();
	double money=0;

	Scanner input1= new Scanner(System.in);
	
	Customer(String username,int password){
		this.username=username;
		this.password=password;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	
	public void Buy(Products m){
		m.setTheDateOfPurchase();
		BoughtProducts.add(m);
		
		Pay();
		
	}
	public void Pay(){
		amountToPay=0;
		for(int i=0;i<BoughtProducts.size();i++){
			if(BoughtProducts.get(i).getProductPaid()==true){
				System.out.println("You have already paid for :" +BoughtProducts.get(i).brandInfo()+" "+BoughtProducts.get(i).colorInfo()+" "+BoughtProducts.get(i).typeInfo());	
			}
			if(BoughtProducts.get(i).getProductPaid()==false){
			amountToPay +=BoughtProducts.get(i).getPrice();
			theTotalAmountPaid+=BoughtProducts.get(i).getPrice();
			BoughtProducts.get(i).setProductPaid(true);
			
		}
		}
		System.out.println("*Currently* The amount to pay is "+ amountToPay);
		

	}
	
	public void returnLipstick(Stock obj){
		int tempBrand=0;
		int tempColor=0;
		int tempType=0;
		System.out.println("You want to return a lipstick");
		System.out.println("What is the brand?");
		String brand= input1.next();
		System.out.println("What is the color?");
		String color= input1.next();
		System.out.println("What is the type?");
		String type = input1.next();
		if(brand.equalsIgnoreCase("nyx")){
			tempBrand=0;	
		}
		if(brand.equalsIgnoreCase("essence")){
			tempBrand=1;	
		}
		if(brand.equalsIgnoreCase("mac")){
			tempBrand=2;	
		}
		if(color.equalsIgnoreCase("pink")){
			tempColor=0;
		}
		if(color.equalsIgnoreCase("red")){
			tempColor=1;
		}
		if(type.equalsIgnoreCase("gloss")){
			tempType=0;
		}
		if(color.equalsIgnoreCase("matte")){
			tempType=1;
		}
		
		Lipstick m= new Lipstick(tempBrand,tempColor,tempType);
		
		int index=0;
		for(int i=0;i<BoughtProducts.size();i++){
			if(BoughtProducts.get(i).getBrand()==tempBrand &&BoughtProducts.get(i).getColor()==tempColor &&BoughtProducts.get(i).getType()==tempType){
				
				System.out.println("You want to return:" +BoughtProducts.get(i).brandInfo()+" "+BoughtProducts.get(i).colorInfo());
				index=i;
			}
		}
			if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
				obj.NYXRedGloss.add(m);
				
				money=40;
			}
			if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
				obj.NYXPinkGloss.add(m);
				
				money=40;
			}
			if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
				obj.NYXRedMatte.add(m);
			
				money=50;
			}
			if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
				obj.NYXPinkMatte.add(m);
				money=50;
			}
			
			if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
				obj.EssenceRedGloss.add(m);
				money=20;
			}
			if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
				obj.EssencePinkGloss.add(m);
	
				money=20;
			}
			if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
				obj.EssenceRedMatte.add(m);
				
				money=30;
			}
			if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
				obj.EssencePinkMatte.add(m);
			
				money=30;
			}
			
			if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
				obj.MACRedGloss.add(m);
				
				money=90;
			}
			if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
				obj.MACPinkGloss.add(m);
			
				money=90;
			}
			if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
				obj.MACRedMatte.add(m);
			
				money=100;
			}
			if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
				obj.MACPinkMatte.add(m);
			
				money=100;
			}

		BoughtProducts.remove(index);
		theTotalAmountPaid=(theTotalAmountPaid -money);
		System.out.println("You have removed your lipstick");
	}
	
	
	
	public String PrintOutBoughtProducts(){
		String a=null;
		for(int i=0;i<BoughtProducts.size();i++){
			 a=a+BoughtProducts.get(i).toString();
					}
		return a;
	}
	
	public String toString(){
		return "\n"+"**Customer Username:" + username +"\n"+"Total amount paid:"+theTotalAmountPaid+"\n"+"Bought Products"+PrintOutBoughtProducts()+"\n" ;	
		}

}

/*	if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
stockobj2.NYXRedGloss.add(m);
money=40;
}
if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
stockobj2.NYXPinkGloss.add(m);
money=40;
}
if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
stockobj2.NYXRedMatte.add(m);
money=50;
}
if(BoughtProducts.get(index).brand==0&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
stockobj2.NYXPinkMatte.add(m);
money=50;
}

if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
stockobj2.EssenceRedGloss.add(m);
money=20;
}
if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
stockobj2.EssencePinkGloss.add(m);
money=20;
}
if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
stockobj2.EssenceRedMatte.add(m);
money=30;
}
if(BoughtProducts.get(index).brand==1&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
stockobj2.EssencePinkMatte.add(m);
money=30;
}

if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==0){
stockobj2.MACRedGloss.add(m);
money=90;
}
if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==0){
stockobj2.MACPinkGloss.add(m);
money=90;
}
if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==0&&BoughtProducts.get(index).type==1){
stockobj2.MACRedMatte.add(m);
money=100;
}
if(BoughtProducts.get(index).brand==2&&BoughtProducts.get(index).color==1&&BoughtProducts.get(index).type==1){
stockobj2.MACPinkMatte.add(m);
money=100;
}*/
