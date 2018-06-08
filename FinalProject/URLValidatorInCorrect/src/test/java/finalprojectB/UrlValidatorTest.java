
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {
    private boolean printStatus = false;
    private boolean printIndex = false;

   public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
//You can use this function to implement your manual testing	   
	   String[] schemes = {"http","https"};
       UrlValidator urlVal = new UrlValidator(schemes);
       assertTrue(urlVal.isValid("http://www.amazon.com/pathQuery#Fragment"));
       //Invalid Schemes
       assertFalse(urlVal.isValid("htt://www.amazon.com/pathQuery#Fragment"));
       //Invalid Host Name
       assertFalse(urlVal.isValid("http:///pathQuery#Fragment"));
       //Invalid Path
       assertFalse(urlVal.isValid("http://www.amazon.com//pathQuery#Fragment"));
       
   }

    public void testManualTest01()
    {
        UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
        assertTrue(urlVal.isValid("htt://www.amazon.com/pathQuery#Fragment"));
        assertTrue(urlVal.isValid("httttttt://www.amazon.com/pathQuery#Fragment"));
        assertTrue(urlVal.isValid("htsdft://www.amazon.com/pathQuery#Fragment"));
        assertTrue(urlVal.isValid("httttttffdt://www.amazon.com/pathQuery#Fragment"));
        //Allow all schemes but numbers
        assertFalse(urlVal.isValid("1234://www.amazon.com/pathQuery#Fragment"));
        //Allow all schemes but null
        assertFalse(urlVal.isValid("://www.amazon.com/pathQuery#Fragment"));
        
    }
    public void testManualTest02()
    {
        UrlValidator urlVal = new UrlValidator(UrlValidator.NO_FRAGMENTS);
        assertTrue(urlVal.isValid("http://www.amazon.com/path.html"));
        //Invalid because of Fragment
        assertFalse(urlVal.isValid("http://www.amazon.com/path.html#Frag"));
    }
    public void testManualTest03()
    {
        UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
        assertTrue(urlVal.isValid("http://www.amazon.com/pathQuery#Frag"));
        //Valid Path with double /
        assertTrue(urlVal.isValid("http://www.amazon.com//pathQuery#Frag"));
        //too many dash
        assertTrue(urlVal.isValid("http://www.amazon.com////////////pathQuery#Frag"));
        //Invalid Path with no dash        
        assertFalse(urlVal.isValid("http://www.amazon.compathQuery#Frag"));
        
    }
    public void testManualTest04()
    {
        UrlValidator urlVal = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);
        assertTrue(urlVal.isValid("http://amazon/"));
        
        assertTrue(urlVal.isValid("http://amazon/path.html"));
    }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   
   
   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   

   }
   //You need to create more test cases for your Partitions if you need to 
   
   public void testIsValid()
   {
	   //You can use this function for programming based testing       

   }
    
    public void testIsValidScheme()
    {
        if(printStatus)
        {
            System.out.print("\n testIsValidScheme() ");
        }
        String[] schemes = {"http", "httt"};
        UrlValidator urlVal = new UrlValidator(schemes, 0);
        for (int xIndex = 0; xIndex < testScheme.length; xIndex++)
        {
            ResultPair testPair = testScheme[xIndex];
            boolean result = urlVal.isValidScheme(testPair.item);
            assertEquals(testPair.item, testPair.valid, result);
            if(printStatus)
            {
                if(result == testPair.valid)
                {
                    System.out.print('.');
                }
                else
                {
                    System.out.print('X');
                }                
            }
        }
        if(printStatus)
        {
            System.out.println();
        }
    }
   
    public static void main(String[] argv)
    {
        UrlValidatorTest fact = new UrlValidatorTest("url test");
        fact.testIsValidScheme();
    }

    ResultPair [] testScheme = {new ResultPair("http", true),
                                new ResultPair("ftp", false),
                                new ResultPair("httpd", false),
                                new ResultPair("telnet", false)};

}
