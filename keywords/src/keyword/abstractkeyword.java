package keyword;
abstract class Waterfall
{  
    abstract void place();  
      
}  
class State extends  Waterfall
{  
  
    void place() {  
        System.out.println("Waterfall is at Thrissur");  
      
    }  
      
}  
public class abstractkeyword {
	public static void main(String[] args) {  
		  
	    State obj=new State();  
	    obj.place();  
	    }   
}
