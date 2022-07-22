import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartArr {
public static ChromeDriver driver;
	public static void setup(Object[]inputParameters){
		String one=(String) inputParameters[0];
		String two=(String) inputParameters[1];
		System.setProperty(one, two);
		driver=new ChromeDriver();
		driver.manage().window().maximize();}
	public static void blaunch(Object[]inputParameters){
		String url=(String) inputParameters[0];
		driver.get(url);}
	public static void signin(Object[]inputParameters){
		String xpath=(String) inputParameters[0];
		String email=(String) inputParameters[1];
		driver.findElementByXPath(xpath).sendKeys(email);}
	public static void login(Object[]input){
		String path=(String) input[0];
		String pass=(String) input[1];
		driver.findElementByXPath(path).sendKeys(pass);}
	public static void submit(Object[] input){
		String sub=(String) input[0];
		driver.findElementByXPath(sub).click();}
	public static void main(String[] args) {
		Object [] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="D:\\SoftwareAutomation\\chromedriver.exe";
		FlipkartArr.setup(input);
Object [] input1=new Object[1];
		input1[0]="https://www.flipkart.com";
		FlipkartArr.blaunch(input1);
		Object [] input2= new Object[2];
		input2[0]="(//input[@type='text'])[2]";
		input2[1]="n.svastav@gmail.com";
		FlipkartArr.signin(input2);
Object[] inp1=new Object[2];
	inp1[0]="//span[contains(text(),'Enter Password')]/../..//input";
	inp1[1]="pass@123";
	FlipkartArr.login(inp1);
	Object[] inp2=new Object[1];
	inp2[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
	FlipkartArr.submit(inp2);
}
}
