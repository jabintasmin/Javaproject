package extentList;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentList.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Date;

public class ExtentListener implements ITestListener {
    static Date date=new Date();
    static String reportName="Selenium for New_"+date.toString().replace("","_").replace(":","_")+".html";
    private static ExtentReports extent= ExtentManager.createInstance(System.getProperty("user.dir")
            +"/ExtentReports/"+reportName);

    private  static ThreadLocal<ExtentTest> test =new ThreadLocal <>();

    public void onStart(ITestContext context) {
        System.out.println("Selenium Learning Start");

    }
    public void onFinish(ITestContext context) {
        System.out.println("Selenium Learning Ending");
        extent.flush();


    }
    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+"started");
        ExtentTest extentTest=extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+"Test Passed");
        test.get().pass("Test Passed");

    }
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+"Test failed with Exception");
        test.get().fail("Test Fail");

    }

    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+"Test Skipped");
        test.get().skip("Test Skipped");

    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }
}

