
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class vendorfashion {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKIT\\Downloads\\All Driver\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://qa.avendorz.com/home");

		//driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='nav-link text-primary']")).click();
		
		//java method
		//  1. (use other class method in any other class)
		/*
		 
		//checkemailid a =new checkemailid();
		//a.checkmailidtest();
		//System.out.println(a.checkmailidtest());
		
		//classobject.methodname              or classname.methodname
		
		
		*/
		
		// selenium    1.Webelement
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newvendortest@yopmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");;
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//A.get text,get attribute,get css value,get,tagname,get css value(font-size,font family etc) return type (string)
		
		/*
	    driver.findElement(By.xpath("//div[text()='Email is required']")).getText();  //to check the error message
		 
		String ps=driver.findElement(By.xpath("//input[@type='password']")).getText(); 
		
		System.out.println(ps);
		*/
       
		
		//B.sendkeys,click,clear,find element,find elements  (return type webelement)
		
		/*
		
		WebElement ps=driver.findElement(By.xpath("//input[@type='password']"));
		                           
		ps.sendKeys("123456");                                                         
		
		ps.clear();
		
		Thread.sleep(2000);
		
		ps.sendKeys("123456");
		
		ps.sendKeys(Keys.CONTROL+"a");    // clear without using send keys
		
		Thread.sleep(2000);
		
		ps.sendKeys(Keys.DELETE);
		
		
		*/
		 
        //C.isDispalyed,isEnabled,isSelected
		/*
		 
		boolean fsh = driver.findElement(By.xpath("//label[@for='5ddcccb193552407939147d1']")).isDisplayed();
		
		System.out.println("pass1"+fsh);
		
		if ( fsh )
		{
			System.out.println("pass");
			 
		}
		
		else
		{
			System.out.println("fail");
			
		}
		*/
		
		//D. get size (return type dimension)
		/*
	    Dimension av = driver.findElement(By.xpath("//img[@class='h-36']")).getSize();
	
		int ht=av.height;
		
		int wd=av.width;
		
				
		System.out.println("height"+ht );
		
		System.out.println("width"+wd);
		
		*/
		
		//E. get location(retutn type point class)

        /*
        Point lc = driver.findElement(By.xpath("//a[@href='/home']")).getLocation();
        
		System.out.println(lc);
		
		*/
		 
		//2.Want to get url,title,pagesource, navigate to back and forward button of the browser (extra)
		/*
		
        System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getPageSource());
	
		driver.get("https://www.grammarly.com/");
		
		driver.navigate().back();
		
		//driver.close();
		
		//driver.quit();
		
		 */
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='navbar-item pull-left']")).click();
	
		//3.Mouse handling (return type webelement)
		 /*
		
		WebElement dv=driver.findElement(By.xpath("//div[@class='navbar p-x-sm p-y-0']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dv).build().perform();
		act.pause(2000).perform();
		
		
		WebElement mn = driver.findElement(By.xpath("//img[@alt='Menu']"));
		
		act.click(mn).build().perform();
		.................................................................
		
		WebElement mn = driver.findElement(By.xpath("//img[@alt='Menu']"));
		
		act.click(mn).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	   
		Thread.sleep(5000);
		WebElement eml = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
		
		act.moveToElement(eml).click().keyDown(Keys.SHIFT).sendKeys("test").doubleClick().build().perform();	//move.click.press shift.send text will be in caps.double click so that text should be selected
		
		act.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='password']"))).contextClick().build().perform();  //after moving right click
		
		
		*/
		
		driver.findElement(By.xpath("//a[@href='/product_register/choice']")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Fashion']")).click();;
		
		driver.findElement(By.xpath("//span[text()='Ready to begin']")).click();
		
		//4.Handle dropdown,radio button,checkbox (return type Select command)
		
		
		Select gd=new Select(driver.findElement(By.xpath("//select[@formcontrolname='product_gender']")));
		
		gd.selectByValue("Men");
		
		Select mc=new Select(driver.findElement(By.xpath("//select[@formcontrolname='product_main_category']")));
		
		mc.selectByVisibleText("Party / Night-out");
		
		Select sc=new Select(driver.findElement(By.xpath("//select[@formcontrolname='product_sub_category']")));
		
		sc.selectByVisibleText("Tops");
		
		driver.findElement(By.xpath("//input[@placeholder='Product Number']")).sendKeys("test fashion");
		
		driver.findElement(By.xpath("//input[@placeholder='(x) Letter Max :  Ex. (Super Soft, Vintage Inspired)']")).sendKeys("TEST FASHION015");
	
		driver.findElement(By.id("shdesc")).sendKeys("Test170 maximum letter.");
		
		driver.findElement(By.id("txtFirstName1")).sendKeys("Test10");
		
		driver.findElement(By.id("txtFirstName2")).sendKeys("Test11");
		
		driver.findElement(By.id("txtFirstName3")).sendKeys("Test12");
		
		driver.findElement(By.id("txtFirstName4")).sendKeys("Test13");
		
		driver.findElement(By.xpath("//div[@class='m-t row']//button[@type='submit']")).click();
		
		//Select rc=new Select(driver.findElement(By.xpath("//label[text()=' Reactive']")));
		
		
		
		//4.Want to click button multiple times
		/*
		 int i=1;
		 
		 while (i<5)
		 {
			 driver.findElement(By.xpath("//a[@href='/home']")).click();
			 
			 i++;
			
		}
		
		for (int j = 1; j <5; j++) 
		{
			driver.findElement(By.xpath("//a[@href='/home']")).click();
			
		}
		*/
		
		//5.want to check how many checkbox is present on the webpage and handle checkbox
		/*
		System.out.println(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		*/
		
		//6.handle auto suggestive dropdown(ex- if we write text according to that suggestion appears )
		/*
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ind");;
		Thread.sleep(2000);   //wait for opening the dropdown
		 
		List<WebElement> option1 = driver.findElements(By.xpath("//a[@href='/home']"));   // in dropdown select the option india
		
		for (WebElement options:option1)                                 //it is enhanced for loop
		{
			if (options.getText().equalsIgnoreCase("india")) 
			{
				options.click();
				
				break;
			}
		}
		*/
		
		//7.Handling calendar
		/*
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		System.out.println("pass1");
		
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		
		System.out.println("pass2");
		
		............................................................
		//select date of future month
		 
		 driver.get("https://www.spicejet.com/");
       
       Thread.sleep(9000);
	   
       driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
       
       Thread.sleep(5000);
	   
	   while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']")).getText().contains("December"))
		  
	   {
		   
		   driver.findElement(By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-last'] a[class='ui-datepicker-next ui-corner-all']")).click();
		   
		
	}
	     Thread.sleep(5000);
	   //driver.findElement(By.className("ui-state-default")).getText();
	  
	   
	   int all = driver.findElements(By.className("ui-state-default")).size();
	   
	   for (int i = 0; i < all; i++) 
	   {
		
		   String tx = driver.findElements(By.className("ui-state-default")).get(i).getText();
		   
		   
		   if (tx.equalsIgnoreCase("15")) 
		   
		   {
			 driver.findElements(By.className("ui-state-default")).get(i).click();
			 
			 break;
			   
		} 
		   
		
		*/
		
		//8.Assertion using testng
		
        //System.out.println(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
        
        Assert.assertFalse(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='md-check checkbox-inline l-s p-l-0']//input[@type='checkbox']")).isSelected());
		
		//System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//9.want to check that any button is enabled or disabled (validating if ui elements are disable or enabled)
		/*
		
		 if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		        
	        {
				System.out.println("is disabled");
			    Assert.assertTrue(true);
			}
	        else 
	        
	        {
	        	System.out.println("is enabled");
	        	Assert.assertFalse(true);
			}
	        */
		
		//10.handling java alerts using selenium
		/*
        String text="ankit";
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
        */

		//11.code formatting and debugging
		
		//how to format and align code  (ctrl+shift+f)
		
		//naming conventions in defining class and variable and method name.  (camelcase)
		  //public class Vendorfashion (class name first text should be in caps)
		  //String namePlaceholder=driver ....  variable and method name (first letter should be small but next word should be in caps)
		
		
		//11.//A.Want to select product when there are same html tags (array of products)
		/*
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> allproduct = driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for (int i = 0; i < allproduct.size(); i++) 
		{
			
			String name = allproduct.get(i).getText();
			
			if (name.contains("Cucumber"))
			{
			
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				 
				break;
				
			}
		}
		
		*/
		
		//B.Want to select multiple products
		/*
		int j=0;
		
		String[] twonames = {"Brocolli","Cucumber"};
		
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			
			List<WebElement> allproduct = driver.findElements(By.cssSelector("h4.product-name"));
			
			
			for (int i = 0; i < allproduct.size(); i++) 
			
			{
				//format it to get actual vegetable name
				//Brocolli - 1 Kg
				
				String[] name = allproduct.get(i).getText().split("-");
				//name[0]	 - Brocolli
				//name[1]   - 1 Kg		
				
				String actualname = name[0].trim();
				
				//convert array into array list for easy search
				List actulaitems=Arrays.asList(twonames);
				
				
				//check whether name you extracted is present in array list or not
				
				if (actulaitems.contains(actualname))
				{
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					if (j==2) 
					{
						break;
						
					}
				}
			}
		*/
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@class='ui-check m-b-0 text-sm']/input[@value='Reactive']")).click();
		
		driver.findElement(By.xpath("/input[@class='ng-pristine ng-invalid has-value ng-touched']")).click();
		
		Select clr = new Select (driver.findElement(By.xpath("//select[@class='form-control form-control-sm custom-select']")));
	
		clr.selectByValue("bright-white");
		
		//12.Explicit wait
		/*
		WebDriverWait w=new WebDriverWait(driver, 5);
	      
	      w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
	      
	      System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		*/
		
		//13. window handling
		
		/*
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		   
		  // System.out.println(driver.getTitle());
		   
		   driver.findElement(By.xpath("//a[text()='Help']")).click();
		   
		   Set<String> ids = driver.getWindowHandles();
		   
		   Iterator<String> it = ids.iterator();  // initially iterator has 0 value if we iterate once then it switch to first parent id
		 
		   
		   String parent = it.next();
		   String child = it.next();
		   
		   
		   driver.switchTo().window(child);
		   
		   System.out.println(driver.getTitle());
		
		*/
		
		//14.frame handling
		/*
		driver.get("https://jqueryui.com/droppable/");
		   
		   driver.findElements(By.tagName("iframe")).size();
		 
		   
		   driver.switchTo().frame(0);
		   
		   Actions ac = new Actions(driver);
		  
		   	WebElement source = driver.findElement(By.id("draggable"));
		   	
		   	WebElement destination =driver.findElement(By.id("droppable"));
		   	
		 
		   ac.dragAndDrop(source, destination).build().perform();
		   
		   driver.switchTo().defaultContent();            // to come back in original frame
		
		*/
		
	//15.Finding counts of links in fotter and click on all links
		
		/*	 
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   
	   
	   System.out.println(driver.findElements(By.tagName("a")).size());         //full page tags
	   
	   WebElement fotter = driver.findElement(By.id("gf-BIG"));          //we have to make the sub driver(webelement)(come in fotter)
	   
	  System.out.println(fotter.findElements(By.tagName("a")).size());   //in fotter links
	   
	  WebElement allinks = fotter.findElement(By.xpath("//div/table/tbody/tr/td")); 
	  
	  System.out.println(allinks.findElements(By.tagName("a")).size());
	  
			  
	  for (int i = 1; i <allinks.findElements(By.tagName("a")).size(); i++) 
	  {
	
		  String ifclick = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  allinks.findElements(By.tagName("a")).get(i).sendKeys(ifclick);
		  
		  Thread.sleep(5000);
	}
	
	// to get all the title of the child window via window handle
	Set<String> id = driver.getWindowHandles();
	  Iterator<String> nt = id.iterator();	  
	  
	  
	  while (nt.hasNext()) 
	  {
		driver.switchTo().window(nt.next());
		
		System.out.println(driver.getTitle());
		
	}
	  
	  
	  
	  
	*/
		
		
	//16.A.want to extract data from the excel (and with the condition that if that field is date field or numeric field)
		/*
		 * 
		 * File file=new File("C:/Users//ANKIT//Desktop/mavenexcel.xlsx");

		FileInputStream mavsheet=new  FileInputStream(file);
		
		
		Workbook wb=WorkbookFactory.create(mavsheet);
		
		
		Sheet frst = wb.getSheet("Sheet1");
		
		Row frow = frst.getRow(1);
		Cell tcell = frow.getCell(2);
		
		// double op = tcell.getNumericCellValue();
		
		//System.out.println(op);
		
		if (DateUtil.isCellDateFormatted(tcell)) {
			
			System.out.println("it should execute if it is a date column");
			
			Date dt = tcell.getDateCellValue();
			
			System.out.println(dt);
		}
		
		else {
			
			System.out.println("if it is just a number then ");
			
			double nv = tcell.getNumericCellValue();
			
			System.out.println(nv);
		}
		
		*/
		 
	//b.want to no total row and then in each row how many coloums and in each coloum retrieve data
		
		/*
		 * File file=new File("C:/Users//ANKIT//Desktop/mavenexcel.xlsx");

		FileInputStream mavsheet=new  FileInputStream(file);
		
		
		Workbook wb=WorkbookFactory.create(mavsheet);
		
		
		Sheet frst = wb.getSheet("Sheet1");
		
		int totalrow = frst.getLastRowNum();
		
		System.out.println("total rows" +totalrow);
		
		
		for (int i = 0; i <totalrow; i++) {
			
			 
		Row rw = frst.getRow(i);
			
			int tcl = rw.getLastCellNum();
			
			System.out.println("total cell in each row" +tcl);
			
		
		
		for (int j = 0; j <tcl; j++) {
			
			Cell ctlcolmn = rw.getCell(j);
			
			CellRangeAddress thisaccl = ctlcolmn.getArrayFormulaRange();
			
			System.out.println("this is the actual name of the coloumn" +thisaccl);
			
			
		}
		
		
		}
		
		
	}
	
	
		 * 
		 * 
		 */
		
	//c. want to create excel file from selenium
		/*
		 *  File file=new File("C:/Users//ANKIT//Desktop/mavenexcel1.xlsx");

		FileOutputStream mavsheet1=new  FileOutputStream(file);
		
		Workbook wb=new XSSFWorkbook();
		
		Sheet newsheet = wb.createSheet("test automation");
		
		Row rw = newsheet.createRow(3);
		
		Cell cl = rw.createCell(5, CellType.STRING);
		
		cl.setCellValue("ankit");
		
		wb.write(mavsheet1);
		
	}
	
		 */
		
	
	}

	

}



























