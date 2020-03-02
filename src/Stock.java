import java.util.ArrayList;
public class Stock {
	
	//Products m= new Products();
	ArrayList< Products > NYXPinkGloss= new ArrayList< Products >();
	ArrayList<Lipstick> NYXPinkMatte= new ArrayList<Lipstick>();
	ArrayList<Lipstick> NYXRedGloss= new ArrayList<Lipstick>();
	ArrayList<Lipstick> NYXRedMatte= new ArrayList<Lipstick>();
	

	ArrayList<Lipstick> EssencePinkGloss= new ArrayList<Lipstick>();
	ArrayList<Lipstick> EssencePinkMatte= new ArrayList<Lipstick>();
	ArrayList<Lipstick> EssenceRedGloss= new ArrayList<Lipstick>();
	ArrayList<Lipstick> EssenceRedMatte= new ArrayList<Lipstick>();
	
	
	ArrayList<Lipstick> MACPinkGloss= new ArrayList<Lipstick>();
	ArrayList<Lipstick> MACPinkMatte= new ArrayList<Lipstick>();
	ArrayList<Lipstick> MACRedGloss= new ArrayList<Lipstick>();
	ArrayList<Lipstick> MACRedMatte= new ArrayList<Lipstick>();

	
	{
		
		for(int i=0;i<10;i++){
			NYXPinkGloss.add(new Lipstick(0,1,0)) ;	
	}
		for(int i=0;i<10;i++){
			NYXPinkMatte.add(new Lipstick(0,1,1));	
	}
		for(int i=0;i<10;i++){
			NYXRedMatte.add(new Lipstick(0,0,1));	
	}
		for(int i=0;i<10;i++){
			NYXRedGloss.add(new Lipstick(0,0,0));
			}
	
		
		for(int i=0;i<10;i++){
			EssencePinkGloss.add(new Lipstick(1,1,0));	
	}
		for(int i=0;i<10;i++){
			EssencePinkMatte.add(new Lipstick(1,1,1)) ;	
	}
		for(int i=0;i<10;i++){
			EssenceRedMatte.add(new Lipstick(1,0,1)) ;	
	}
		for(int i=0;i<10;i++){
			EssenceRedGloss.add(new Lipstick(1,0,0));	
	}
	
		
		for(int i=0;i<10;i++){
			MACPinkGloss.add(new Lipstick(2,1,0));	
	}
		for(int i=0;i<10;i++){
			MACPinkMatte.add(new Lipstick(2,1,1)) ;	
	}
		for(int i=0;i<10;i++){
			MACRedMatte.add( new Lipstick(2,0,1));	
	}
		for(int i=0;i<10;i++){
			MACRedGloss.add(new Lipstick(2,0,0));	
	}
		
		//Mac Prices
		for(int i=0;i<MACPinkGloss.size();i++){
			MACPinkGloss.get(i).setPrice(90);
		}	
		for(int i=0;i<MACPinkMatte.size();i++){
			MACPinkMatte.get(i).setPrice(100);
		}	
		for(int i=0;i<MACRedMatte.size();i++){
			MACRedMatte.get(i).setPrice(100);
		}	
		for(int i=0;i<MACRedGloss.size();i++){
			MACRedGloss.get(i).setPrice(90);
		}	
		
		//NYX prices
		
		for(int i=0;i<NYXPinkGloss.size();i++){
			NYXPinkGloss.get(i).setPrice(40);
		}	
		for(int i=0;i<NYXPinkMatte.size();i++){
			NYXPinkMatte.get(i).setPrice(50);
		}	
		for(int i=0;i<NYXRedMatte.size();i++){
			NYXRedMatte.get(i).setPrice(50);
		}	
		for(int i=0;i<NYXRedGloss.size();i++){
			NYXRedGloss.get(i).setPrice(40);
		}	
		
		//Essence Prices
		for(int i=0;i<EssencePinkGloss.size();i++){
			EssencePinkGloss.get(i).setPrice(20);
		}	
		for(int i=0;i<EssencePinkMatte.size();i++){
			EssencePinkMatte.get(i).setPrice(30);
		}	
		for(int i=0;i<EssenceRedMatte.size();i++){
			EssenceRedMatte.get(i).setPrice(30);
		}	
		for(int i=0;i<EssenceRedGloss.size();i++){
			EssenceRedGloss.get(i).setPrice(20);
		}	
	}
	
	public void displayTheStock(){
		System.out.println("NYX/PINK/GLOSS:"+NYXPinkGloss.size());
		System.out.println("NYX/RED/GLOSS:"+NYXRedGloss.size());
		System.out.println("NYX/PINK/MATTE:"+NYXPinkMatte.size());
		System.out.println("NYX/RED/MATTE:"+NYXRedMatte.size());
		System.out.println("Essence/PINK/GLOSS:"+EssencePinkGloss.size());
		System.out.println("Essence/RED/GLOSS:"+EssenceRedGloss.size());
		System.out.println("Essence/PINK/MATTE:"+EssencePinkMatte.size());
		System.out.println("Essence/RED/MATTE:"+EssenceRedMatte.size());
		System.out.println("MAC/PINK/GLOSS:"+MACPinkGloss.size());
		System.out.println("MAC/RED/GLOSS:"+MACRedGloss.size());
		System.out.println("MAC/PINK/MATTE:"+MACPinkMatte.size());
		System.out.println("MAC/RED/MATTE:"+MACRedMatte.size());
		
		
	}

}
