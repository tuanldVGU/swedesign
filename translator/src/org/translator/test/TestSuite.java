package org.translator.test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


public class TestSuite {
	@RunWith(Suite.class)

	@Suite.SuiteClasses({
	   TestManagePerformedTranslation.class,
	  TestTranslate.class
	})

	public class JunitTestSuite {   
	} 
}
