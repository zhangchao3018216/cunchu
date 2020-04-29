package theme5_2; 
public class Product {	
private String name; //产品名称	
private String factory; //厂家	
private String type; //型号	
private double price; //价格	 	
public Product() {		super();	}		
public Product(String name, String factory, String type, double price) {		
super();		
this.name = name;		
this.factory = factory;		
this.type = type;		
this.price = price;	}		
public String getName() {		
return name;	} 	
public void setName(String name) {		
this.name = name;	} 	
public String getFactory() {		
return factory;	} 	
public void setFactory(String factory) {		
this.factory = factory;	} 	
public String getType() {		
return type;	} 	
public void setType(String type) {		
this.type = type;	} 	
public double getPrice() {		
return price;	} 	
public void setPrice(double price) {		
this.price = price;	} 	
@Override	
public String toString() {		
return "[产品名称=" + name + ", 厂家=" + factory + ", 型号=" + type + ", 价格=" + price + "]";	}}
