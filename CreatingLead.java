package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title= driver.getTitle();
		System.out.println("Title: "+title );
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arthi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/26/2000");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("M.Sc.");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("30000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1001");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hard Worker");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Workaholic");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("6");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("PKBJ");
		
		WebElement couCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		couCode.clear();
		couCode.sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("607");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("402");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("May i speak to Arthi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Arthiyellow@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Arthi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Pavi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("108 Sivan Street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Lawspet");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Puducherry");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("607402");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Puducherry");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		String fname= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("first name: "+fname);
		
		
		String title2= driver.getTitle();
		System.out.println("Title: "+title2);
	}

}
