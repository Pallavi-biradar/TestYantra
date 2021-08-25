package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver ;
	
	//Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Elements
	@FindBy(xpath="//a[@class='content selected tt']") private WebElement timeTrackLink ;
	
	@FindBy(xpath="//a[@class='content tasks']") private WebElement tasksLink ;
	
	@FindBy(xpath="//a[@class='content reports']") private WebElement reportsLink ;
	
	@FindBy(xpath="//a[@class='content users']") private WebElement usersLink ;
	
	@FindBy(id="logoutLink") private WebElement logoutLink ;

	//Getters 
	public WebElement getTimeTrackLink() {
		return timeTrackLink;
	}

	public WebElement getTasksLink() {
		return tasksLink;
	}

	public WebElement getReportsLink() {
		return reportsLink;
	}

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	//Business logics
	public LoginPage logOut() {
		logoutLink.click();
		return new LoginPage(driver);
	}
}
