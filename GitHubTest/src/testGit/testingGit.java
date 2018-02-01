package testGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingGit {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Tutorial\\chromedriver_win32\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
		WD.get("http://facebook.com");
		WD.close();
	}
}
