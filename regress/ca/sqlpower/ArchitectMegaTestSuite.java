package ca.sqlpower;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ArchitectMegaTestSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test Everything");
		//$JUnit-BEGIN$
		
		suite.addTest(ArchitectBusinessTestSuite.suite());
		suite.addTest(ArchitectSwingTestSuite.suite());
		//$JUnit-END$
		return suite;
	}
}