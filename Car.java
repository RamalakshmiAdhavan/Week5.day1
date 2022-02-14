package testng;

import org.testng.annotations.Test;

public class Car {
	@Test(priority=0)
	public void aStartthecar() {
	System.out.println("");
	}
	@Test
	public void bputfirstgear() {
			System.out.println("1stgear");
			}
	@Test
	public void cputsecondgear(){
			System.out.println("2nd gear");
			}
	@Test
	public void dputthirdgear(){
			System.out.println("3rdgear");
			}
	@Test
	public void egothecar(){
			System.out.println("gothecar");
			}
}


