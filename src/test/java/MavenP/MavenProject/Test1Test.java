package MavenP.MavenProject;

import org.testng.annotations.Test;

public class Test1Test {

	
	@Test
	
	public void testing1() {
		
		System.out.println("HI1");
	}
	
	
	// Maven project creation 
	/*
	 * 
	 * 
	 * 1. Download maven and do the configurations Select the catalog and the add group id and artefsct id as project and packg name
	 * 2.Add test cases under test folder
	 * 3.NAme the tescases endging with the name as Test
	 * Add the dependencied under pom.xml file, also add the testng xml configuration under surefire plugin in pom.xml
	 * go to cmd and run the test cases as mvn test
	 * 
	 * mvn test -P("id name whichever we are giving")>>>> for xml profiling if we want to use mulitple xmls
	 * we will copy from build create <profiles ><profile>and paste then create an <id></id>under profile and change the xml file name under it and run according to file name
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
