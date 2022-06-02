package ParaBank.ParaBankAuotmate;

import org.openqa.selenium.By;

public class listOfActions {
	paraBankMain mainClass = new paraBankMain();
	
	public void createAccount() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		logOutAccount();
	}
	
	public void accountOverview() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
		logOutAccount();
	}
	
	public void transferFunds() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		logOutAccount();
	}
	
	public void billPay() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
		logOutAccount();
	}
	
	public void findTransactions() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
		logOutAccount();
	}
	
	public void updateContactInfo() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();
		logOutAccount();
	}
	
	public void requestLoan() throws Exception {
		mainClass.setUp();
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Request Loan')]")).click();
		logOutAccount();
	}
	
	public void logOutAccount() throws Exception {
		Thread.sleep(1000);
		mainClass.driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		mainClass.driver.quit();
	}
}