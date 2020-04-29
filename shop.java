package theme5_2; 
import java.util.Scanner; 
public class Shop {	
//商店中各个配件的存货。注意数组越界	
private CPU[] cpus=new CPU[2];	
private Screen[] screens=new Screen[2];	
private Rem[] rems=new Rem[2];		
//构造方法。相当于店铺进货	
public Shop() {		super();				
cpus[0]=new CPU("CPU", "Intel", "I7-7600", 1500, "2M");		
cpus[1]=new CPU("CPU", "Intel", "I5-7600", 1000, "2M");				
screens[0]=new Screen("显示器", "KTC", "KTC2400", 1500, "24英寸");		
screens[1]=new Screen("显示器", "联想", "21英寸高清", 1700, "21英寸");				
rems[0]=new Rem("内存条", "戴尔", "2133P-R", 1790, "32G");		
rems[1]=new Rem("内存条", "戴尔", "DDR4", 1279, "16G");	}		
public void service(Customer cust)	{		
System.out.println("欢迎 "+cust.getName());		
System.out.println("选择您喜欢的配件，组装适合您的电脑：");		
System.out.println("说明：选择对应编号即可添加到购物车，0：不选择\n");				
double cost=0;				
showCpus();		int opt1=getOpt(cpus.length);		
CPU cpu=null;		if(opt1!=0)		
{			cost+=cpus[opt1-1].getPrice();			
cpu=cpus[opt1-1];		}					
showScreens();		
int opt2=getOpt(screens.length);		
Screen screen=null;		
if(opt2!=0)		
{			
cost+=screens[opt2-1].getPrice();			
screen=screens[opt2-1];		
}					
showRems();		
int opt3=getOpt(rems.length);		
Rem rem=null;		if(opt3!=0)		
{			cost+=rems[opt3-1].getPrice();
			
rem=rems[opt3-1];		}
					
Computer com=new Computer("组装机", cust.getName(), null, cost, cpu, screen, rem);
		System.out.println(com);		com.showDetail();	}

		
private int getOpt(int max)	{		
Scanner sc=new Scanner(System.in);		
int opt;		
while((opt=sc.nextInt())>max || opt<0)			
System.out.print("输入非法，请重现输入：");		
System.out.println();		return opt;	}		
private void showCpus() 	{		for(int i=0;i<cpus.length;i++)	
		System.out.println((i+1)+"："+cpus[i]);		
System.out.print("请选择CPU：");	}		
private void showScreens()	{		
for(int i=0;i<screens.length;i++)			
System.out.println((i+1)+"："+screens[i]);		
System.out.print("请选择显示器：");	}		
private void showRems()	{		
for(int i=0;i<rems.length;i++)			
System.out.println((i+1)+"："+rems[i]);		
System.out.print("请选择内存条：");	
}	}
