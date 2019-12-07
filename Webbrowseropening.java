package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webbrowseropening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\eclipse\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		

	}

}
