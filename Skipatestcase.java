package testng;

import org.testng.annotations.Test;

public class Skipatestcase {
	@Test(priority=0)
	public void firstTestcase() {
	System.out.println("this is the first test case for TESTNG");
	}
	@Test(enabled=false)
	public void secondTestcase() {
			System.out.println("this is the 2nd test case for TESTNG");
			}
	@Test
	public void thirdTestcase(){
			System.out.println("this is the 3rd test case for TESTNG");
			}
	@Test
	public void forthTestcase(){
			System.out.println("this is the 4th test case for TESTNG");
			}
}

