package testng;

import org.testng.annotations.Test;

public class Dependancies {

	@Test(enabled=true)
	public void Highshcool() {
		System.out.println("Highschool");
	}
	@Test(dependsOnMethods="highschool")
	public void Higersecondary() {
		System.out.println("Higersecondary");
	}
	@Test(dependsOnMethods="Higersecondary")
	public void college() {
		System.out.println("college");
	}
}
