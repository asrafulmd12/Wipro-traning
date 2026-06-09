package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        System.out.println("===== TEST SUITE STARTED =====");
    }

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println(
                "STARTED : "
                        + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println(
                "PASSED : "
                        + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println(
                "FAILED : "
                        + result.getMethod().getMethodName());

        System.out.println(
                "REASON : "
                        + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println(
                "SKIPPED : "
                        + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("===== TEST SUITE FINISHED =====");
    }
}