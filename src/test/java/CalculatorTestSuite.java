
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class})
public class CalculatorTestSuite {

	@BeforeClass
	public static void setUpClass() throws Exception {
	
	
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		System.out.println("Before started the test...");
		
	}

	@After
	public void tearDown() throws Exception {

		System.out.println("After completed the test...");
	}

}
