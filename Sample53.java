import java.util.*;   // abstract (Loose couplling achieve) example
abstract class Watch
{
	void showtime()
	{
		Date d = new Date();
		System.out.println("Date is "+d);
	}
	abstract void showweather();
}
class Rolex extends Watch
{
	void showweather()
	{
		System.out.println("Weather is Rainy");
	}
}
class Fasttrack extends Watch
{
	void showweather()
	{
		System.out.println("Weather is Foggy");
	}
}
class Smartwatch extends Watch
{
	void showweather()
	{
		System.out.println("Weather is Sunny");
	}
}
class Display
{
	void show(Watch w)
	{
		w.showtime();
		w.showweather();
	}
}
public class Sample53 
{
	public static void main(String[] args) 
	{
		Display d = new Display();
		d.show(new Rolex());
        d.show(new Fasttrack());
        d.show(new Smartwatch());
	}

}
