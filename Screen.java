package theme5_2; 
public class Screen extends Product 
{	
private String size; //显示器特有属性：大小。以此参数作为属性举例，其他参数略	
		
public Screen() 
{		
super();	
} 	
public Screen(String name, String factory, String type, double price, String size) {
		super(name, factory, type, price);
		this.size=size;	
}		
public String getSize() {		
return size;	
} 	
public void setSize(String size) {
		this.size = size;
	} 	
@Override	
public String toString() {		
String superStr=super.toString();		
return "显示器 "+superStr.substring(0, superStr.length()-1)+", 尺寸=" + size + "]";	
}
}
