package test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({})

@Suite
@SelectPackages("com.test")  //provide all the test case packages name
@SuiteDisplayName(value="My All jUnit5 test files")
public class AllTests {

}
