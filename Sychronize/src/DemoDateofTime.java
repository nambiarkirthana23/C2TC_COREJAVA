import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DemoDateofTime {

	public static void main(String[] args)  {
	
       LocalDate ld=LocalDate.now();
       System.out.println(ld);
     
		LocalTime ld1=LocalTime.now();
       System.out.println(ld1);
     
		LocalDateTime ld2=LocalDateTime.now();
		System.out.println(ld2);
		
		LocalDateTime ld3=LocalDateTime.of(1008,05,20,0,0);
		System.out.println(ld3);
		
		LocalDateTime ld4=LocalDateTime.of(1008,Month.APRIL,20,0,0);
		System.out.println(ld4);
		
		LocalDateTime ld5=LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(ld5);
	}

}
