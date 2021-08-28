package testng_listener;
    import base.ScriptBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

    public class Listener extends ScriptBase implements ITestListener {

        @Override
        public void onTestStart(ITestResult result) {

        }

        @Override
        public void onTestSuccess(ITestResult result) {
            Calendar calendar=Calendar.getInstance();
            SimpleDateFormat formater= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            String methodName=result.getName();
            if(result.getStatus()==ITestResult.SUCCESS){
                File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                try{
                    String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/success_screenshots";
                    File destinationFile=new File((String)reportDirectory+ "/"+ methodName + "_"+formater.format(calendar.getTime())+".png");
                    FileUtils.copyFile(srcFile,destinationFile);
                    Reporter.log("<a href='" + destinationFile.getAbsolutePath() + "'> <image src='" + destinationFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
                }catch (Exception e){
                    e.printStackTrace();

                }

            }
        }

        @Override
        public void onTestFailure(ITestResult result) {
            Calendar calendar=Calendar.getInstance();
            SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
            String methodName=result.getName();
            if(result.getStatus()==ITestResult.FAILURE){
                File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                try{
                    String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/failure_screenshots";
                    File destinationFile=new File((String)reportDirectory+ "/"+ methodName + "_"+formater.format(calendar.getTime())+".png");
                    FileUtils.copyFile(srcFile,destinationFile);
                    Reporter.log("<a href='" + destinationFile.getAbsolutePath() + "'> <image src='" + destinationFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
                }catch (Exception e){
                    e.printStackTrace();

                }

            }

        }

        @Override
        public void onTestSkipped(ITestResult result) {

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        }



        @Override
        public void onStart(ITestContext context) {

        }

        @Override
        public void onFinish(ITestContext context) {

        }
    }


