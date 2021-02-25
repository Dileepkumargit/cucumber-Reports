package JavaCode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static  JavaCode.Hooks.driver;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class stepdefination {
	
	@Given("^I want to google website$")
	public void i_want_to_google_website() throws Throwable {
	   driver.get("http://www.google.com");
	}

	@When("^enter the search keyword$")
	public void enter_the_search_keyword() throws Throwable {
	   System.out.println("welcome to google");
	}


}
