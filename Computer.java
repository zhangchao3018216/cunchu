package theme5_2; 
public class Computer extends Product {
	private CPU cpu;	
	private Screen screen;	
	private Rem rem;		
	public Computer() {		
		super();	
		}		
	public Computer(String name, String factory, String type, double price, CPU cpu, Screen screen, Rem rem) 
	{		super(name, factory, type, price);		
	this.cpu=cpu;		
	this.screen=screen;		
	this.rem=rem;	} 	
	public CPU getCpu() {		
		return cpu;	} 	
	public void setCpu(CPU cpu) {	
		this.cpu = cpu;	} 	
	public Screen getScreen() {		
		return screen;	
		} 	
	public void setScreen(Screen screen) {		
		this.screen = screen;	
		} 	public Rem getRem() {	
			return rem;	
			} 	
		public void setRem(Rem rem) {	
			this.rem = rem;	} 	
		@Override	
		public String toString() {		return "电脑 "+super.toString();	} 		
		public void showDetail()	{		System.out.println("配件：");	
		if(cpu!=null)			
			System.out.println(cpu);	
		if(screen!=null)			
			System.out.println(screen);		
		if(rem!=null)			
			System.out.println(rem);	}	}
