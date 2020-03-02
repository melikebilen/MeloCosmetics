import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.ArrayList;
public class Products  implements ProductInformation,ExpirationDate{
	public enum Color {RED,PINK,ORANGE,YELLOW,BLACK,WHITE};
	public enum Brand {NYX,Essence,MAC};
	public enum Type { Gloss,Matte};
	private double price=0;
	private int remain;
    public	int color;
    public int brand;
    LocalDateTime theDateOfPurchase;
   	private boolean productPaid=false;
   	Calendar expirationDateOfProduct;

	public int type;
   

	public void getExpirationDate(){
	 	Calendar expirationDate= Calendar.getInstance();
	 	expirationDate.set(2024, 4, 13);
	 	expirationDateOfProduct=expirationDate;
	 //	System.out.println("The expiration date:"+expirationDateOfProduct );
	 	
	}

	
	 public int colorRed= Color.RED.ordinal();
	 public int colorPink= Color.PINK.ordinal();
	 public  int colorOrange= Color.ORANGE.ordinal();
	 public  int colorYellow= Color.YELLOW.ordinal();
	 public  int colorBlack= Color.BLACK.ordinal();
	 public  int colorWhite= Color.WHITE.ordinal();
	
	 public int brandNYX = Brand.NYX.ordinal();
	 public int brandEssence= Brand.Essence.ordinal();
	 public int brandMAC= Brand.MAC.ordinal();
	 
	 public int typeGloss= Type.Gloss.ordinal();
	 public int typeMatte= Type.Matte.ordinal();
	
	 
	 
	
	Products(){
		
	}
	
	Products(int brand,int color,int type){
		this.brand= brand;
		this.color= color;
		this.type=type;
		getExpirationDate();
	}
	
	

	
	public String colorInfo(){
		if(color==0){
			return "Red";
		}
		if(color==1){
			return	"pink";
		}
		if(color==2){
			return	"orange";
		}
		if(color==3){
			return	"yellow";
		}
		if(color==4){
			return	"black";
		}
		if(color==5){
			return	"white";
		}
		
		return "No info";
		
	}
	
	
	public String brandInfo(){
		if(brand==0){
		return	"NYX";
		}
		if(brand==1){
			return	"Essence";
		}
		if(brand==2){
			return	"MAC";
		}
		return "no info";
	}
	
	public String typeInfo(){

		if(type==0){
			return "gloss";
		}
		if(type==1){
			return "matte";
		}
		return "No info";
		
	}

	 public int getType() {
			return type;
		}
	    

		public void setType(int type) {
			this.type = type;
		}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public  int getRemain() {
		return remain;
	}
	public  void setRemain(ArrayList<Products> m){
		this.remain =m.size();
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getBrand() {
		return brand;
	}

	public void setBrand(int brand) {
		this.brand = brand;
	}

	public boolean getProductPaid() {
		return productPaid;
	}

	public void setProductPaid(boolean productPaid) {
		this.productPaid = productPaid;
	}
	public void setThePurchaseDate(){
		LocalDateTime theDateOfPurchase= LocalDateTime.now();
		System.out.println("The product's purchase date is :" + theDateOfPurchase);	
	}
	
	public void ProductInformation(Products m){
		System.out.println(m);
	}

	

	public LocalDateTime getTheDateOfPurchase() {
		return theDateOfPurchase;
	}

	public void setTheDateOfPurchase() {
		this.theDateOfPurchase= LocalDateTime.now();
		System.out.println("The product's purchase date is :" + theDateOfPurchase);	
	}
	
	public void displayProducts(){
		getExpirationDate();
		System.out.println("-----------");
		System.out.println("Purchase date:"+getTheDateOfPurchase());
		System.out.println("The price of the product is:"+ getPrice());
		System.out.println(brandInfo());
		System.out.println(colorInfo());
		System.out.println(typeInfo());
		System.out.println("Expiration date:"+expirationDateOfProduct);

	}

		public String toString(){
			return 
					"---------------------"+"\n"+"Purchase date:"+ getTheDateOfPurchase()+"\n"+
		"The price of the product is:"+ getPrice() + "\n"+ brandInfo() + "\n"+ colorInfo()+"\n"+ typeInfo()+"\n"+"\n"+"*Expiration Date*"+"\n"+" Year:"+expirationDateOfProduct.get(Calendar.YEAR)+"-"+"Month:"+expirationDateOfProduct.get(Calendar.MONTH) +"\n"+"---------------------";
			
		}

}
