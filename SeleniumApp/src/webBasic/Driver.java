package webBasic;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Please provide the name of the instagram account: ");
		String urlFragment = getString();
		String baseUrl = "https://www.instagram.com/"+urlFragment;
        //String expectedTitle = "Instagram";
        //String actualTitle = "";
        driver.get(baseUrl);
        
        //actualTitle = driver.getTitle();
        
        //if(actualTitle.contentEquals(expectedTitle)) {
        	//System.out.println("Test Passed");
        //}else{
        	//System.out.println("Test failed");
        //}
        //driver.close();
	}
	
	public static String getString(){
		Scanner kyb = new Scanner(System.in);
		String input = kyb.nextLine();
		kyb.close();
		return input;
	}

}
