class Mobile // 'has a' relation example(Application)
{
	Battery b = new Battery();
	void playgame()
	{
		System.out.println("Playing Candycrush");
		b.discharge();
	}
	void makecall()
	{
		System.out.println("Calling");
		b.discharge();
	}
	void sendmsg()
	{
		System.out.println("Message sending");
		b.discharge();
	}
	void charging()
	{
		System.out.println("Charging...");
		b.recharge();
	}
}
class Battery
{
   int charge = 100;
 void discharge() 
 {
	charge=	charge-10;
}

 void recharge() 
 {
	charge = charge+20;
}
	
}
public class Sample36 {

	public static void main(String[] args) {
		
           Mobile m = new Mobile();
           System.out.println("Battery Status is "+m.b.charge);
           m.playgame();
           m.makecall();
           m.sendmsg();
           System.out.println("Battery Status is "+m.b.charge);
           m.charging();
           System.out.println("Battery Status is "+m.b.charge);
           
	}

}
