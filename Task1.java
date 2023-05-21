package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
     WebElement createNewAccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
     createNewAccount.click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("amina");
     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("asam");
     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123-345-6565");
     driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("pass@123");
     driver.findElement(By.xpath("//select[@id='month']")).sendKeys("march");
     driver.findElement(By.xpath("//select[@id='day']")).sendKeys("2");
     driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2001");
     WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
     gender.click();
     Thread.sleep(3000);
     WebElement signUp=driver.findElement(By.xpath("//button[text()='Sign Up']"));
     signUp.click();
     Thread.sleep(5000);
     driver.close();




    }
}
