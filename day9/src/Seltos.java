abstract class Mumbai_Rules 
{ 
  abstract void speedLimit();  
  abstract void rashDriving(); 
 	void slowMoving() 
 	{ 
 	 	System.out.println("no fine"); 
 	} 
} 
public class Seltos  extends Mumbai_Rules {
	void speedLimit() 
 	{ 
 	 	System.out.println("The limit is 80"); 
 	} 
 	 void rashDriving() 
 	 { 
 	   System.out.println("Alert voice"); 
      } 
         public static void main(String[] args) 
          { 
        	 Seltos s=new Seltos();  	 	
        	 s.speedLimit(); 
      	 	s.rashDriving(); 
      
      	} 
}
