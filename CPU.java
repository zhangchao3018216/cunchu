package theme5_2; 
public class CPU extends Product { 	
private String buffer; //CPU特有属性：缓存。以此参数作为属性举例，其他参数略	
		
public CPU() {		
super();	
} 	
public CPU(String name, String factory, String type, double price, String buffer) {	
	
super(name, factory, type, price);		
this.buffer=buffer;	}		
public String getBuffer()
 {		
return buffer;	
} 	
public void setBuffer(String buffer) {		
this.buffer = buffer;	
} 	
@Override	public String toString() 
{		
String superStr=super.toString();		
return "CPU "+superStr.substring(0, superStr.length()-1)+", 缓存=" + buffer + "]";	
}
}
